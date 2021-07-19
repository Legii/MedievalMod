//package com.nuget.themedievalmod.common.entities;
//import static java.lang.Math.*;
//
//import net.minecraft.entity.CreatureAttribute;
//import com.nuget.themedievalmod.core.init.EntityTypeInit;
//import net.minecraft.entity.AgeableEntity;
//import net.minecraft.entity.EntityType;
//import net.minecraft.entity.ILivingEntityData;
//import net.minecraft.entity.SpawnReason;
//import net.minecraft.entity.*;
//import net.minecraft.entity.ai.attributes.Attribute;
//import net.minecraft.entity.ai.attributes.Attributes;
//import net.minecraft.entity.ai.goal.*;
//import net.minecraft.entity.passive.AnimalEntity;
//import net.minecraft.nbt.CompoundNBT;
//import net.minecraft.util.math.BlockPos;
//import net.minecraft.world.World;
//import net.minecraftforge.api.distmarker.Dist;
//import net.minecraftforge.api.distmarker.OnlyIn;
//import net.minecraft.util.SoundEvent;
//
//import net.minecraft.entity.AgeableEntity;
//import net.minecraft.entity.Entity;
//import net.minecraft.entity.EntityType;
//import net.minecraft.entity.ILivingEntityData;
//
//
//public class Camel extends AnimalEntity {
//    private EatGrassGoal eatgrassGoal;
//    private int camelTimer;
//    private EatGrassGoal eatGrassGoal;
//
//    public Camel(EntityType<? extends AnimalEntity> type, World worldIn) {
//        super(type, worldIn);
//    }
//
//    @Override
//    public AgeableEntity createChild(AgeableEntity ageable) {
//        Camel entity = new Camel(EntityTypeInit.CAMEL.get(), this.world);
//        entity.onInitialSpawn(this.world, this.world.getDifficultyForLocation(new BlockPos(entity)),
//                SpawnReason.BREEDING, (ILivingEntityData) null, (CompoundNBT) null);
//        entity.setGlowing(true);
//        return entity;
//    }
//    @Override
//    protected void registerGoals() {
//        super.registerGoals();
//        this.eatGrassGoal = new EatGrassGoal(this);
//        this.goalSelector.addGoal(0, new SwimGoal(this));
//        this.goalSelector.addGoal(1, new PanicGoal(this, 1.25D));
//        this.goalSelector.addGoal(2, new BreedGoal(this, 1.0D));
//        this.goalSelector.addGoal(3, new TemptGoal(this, 1.1D, Ingredient.fromItems(ItemInit.DEF_ITEM.get()), false));
//        this.goalSelector.addGoal(4, new FollowParentGoal(this, 1.1D));
//        this.goalSelector.addGoal(5, this.eatGrassGoal);
//        this.goalSelector.addGoal(6, new WaterAvoidingRandomWalkingGoal(this, 1.0D));
//        this.goalSelector.addGoal(7, new LookAtGoal(this, PlayerEntity.class, 6.0F));
//        this.goalSelector.addGoal(8, new LookRandomlyGoal(this));
//}
//
//
//    @Override
//    protected void updateAITasks() {
//        this.camelTimer = this.eatGrassGoal.getEatingGrassTimer();
//        super.updateAITasks();
//    }
//
//    @Override
//    public void livingTick() {
//        if (this.world.isRemote) {
//            this.camelTimer = Math.max(0, this.camelTimer - 1);
//        }
//        super.livingTick();
//    }
//
//    @Override
//    protected void registerAttributes() {
//        super.registerAttributes();
//        this.getAttribute(Attributes.MAX_HEALTH).setBaseValue(16.0D);
//        this.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.23D);
//    }
//
//    @OnlyIn(Dist.CLIENT)
//    public void handleStatusUpdate(byte id) {
//        if (id == 10) {
//            this.camelTimer = 40;
//        } else {
//            super.handleStatusUpdate(id);
//        }
//
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
