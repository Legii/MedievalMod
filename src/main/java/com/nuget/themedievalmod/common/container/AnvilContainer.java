package com.nuget.themedievalmod.common.container;

import java.util.Objects;

import com.nuget.themedievalmod.common.tileentities.AnvilTileEntity;
import com.nuget.themedievalmod.core.init.BlockInit;
import com.nuget.themedievalmod.core.init.ContainerTypesInit;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IWorldPosCallable;

public class AnvilContainer extends Container {

	public final AnvilTileEntity te;
	private final IWorldPosCallable canInteractWithCallable;

	public AnvilContainer(final int windowId, final PlayerInventory playerInv, final AnvilTileEntity te) {
		super(ContainerTypesInit.SMITHY_ANVIL_CONTAINER_TYPE.get(), windowId);
		this.te = te;
		this.canInteractWithCallable = IWorldPosCallable.of(te.getWorld(), te.getPos());

		// Tile Entity.
		this.addSlot(new Slot((IInventory) te, 0, 39, 35));
		this.addSlot(new Slot((IInventory) te, 1, 39, 17));
		this.addSlot(new Slot((IInventory) te, 2, 39, 52));

		// Main Player Inventory
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 9; col++) {
				this.addSlot(new Slot(playerInv, col + row * 9 + 9, 8 + col * 18, 166 - (4 - row) * 18 - 10));
			}
		}

		// Player Hotbar
		for (int col = 0; col < 9; col++) {
			this.addSlot(new Slot(playerInv, col, 8 + col * 18, 142));
		}
	}

	public AnvilContainer(final int windowId, final PlayerInventory playerInv, final PacketBuffer data) {
		this(windowId, playerInv, getTileEntity(playerInv, data));
	}

	private static AnvilTileEntity getTileEntity(final PlayerInventory playerInv, final PacketBuffer data) {
		Objects.requireNonNull(playerInv, "Player Inventory cannot be null.");
		Objects.requireNonNull(data, "Packet Buffer cannot be null.");
		final TileEntity te = playerInv.player.world.getTileEntity(data.readBlockPos());
		if (te instanceof AnvilTileEntity) {
			return (AnvilTileEntity) te;
		}
		throw new IllegalStateException("Tile Entity Is Not Correct");
	}

	@Override
	public boolean canInteractWith(PlayerEntity playerIn) {
		return isWithinUsableDistance(canInteractWithCallable, playerIn, BlockInit.SMITHY_ANVIL.get());
	}

	@Override
	public ItemStack transferStackInSlot(PlayerEntity playerIn, int index) {
		ItemStack stack = ItemStack.EMPTY;
		Slot slot = this.inventorySlots.get(index);
		if (slot != null && slot.getHasStack()) {
			ItemStack stack1 = slot.getStack();
			stack = stack1.copy();
			if (index < AnvilTileEntity.slots
					&& !this.mergeItemStack(stack1, AnvilTileEntity.slots, this.inventorySlots.size(), true)) {
				return ItemStack.EMPTY;
			}
			if (!this.mergeItemStack(stack1, 0, AnvilTileEntity.slots, false)) {
				return ItemStack.EMPTY;
			}

			if (stack1.isEmpty()) {
				slot.putStack(ItemStack.EMPTY);
			} else {
				slot.onSlotChanged();
			}
		}
		return stack;
	}

}
