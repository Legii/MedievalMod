package com.nuget.themedievalmod.common.items;

import com.nuget.themedievalmod.core.init.SoundInit;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class WarHorn extends Item {
    public WarHorn(Properties properties) {
        super(properties);
    }

    @java.lang.Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
    if(!playerIn.getCooldownTracker().hasCooldown(this)) {
        worldIn.playSound(playerIn,new BlockPos(playerIn.getPosition()), SoundInit.WARHORN_SOUND.get(), SoundCategory.AMBIENT,2f,1f);
        playerIn.getCooldownTracker().setCooldown(this,150);
    }





        return ActionResult.resultSuccess(playerIn.getHeldItem(handIn));
    }
}
