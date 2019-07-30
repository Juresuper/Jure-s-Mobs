package juresuper.jurescreatures.entities.SnowWolfMinion;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.IAnimals;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraft.entity.ai.*;
import juresuper.jurescreatures.Main;
import juresuper.jurescreatures.handlers.SoundsHandler;

import javax.annotation.Nullable;



public class EntitySnowWolfMinion extends EntityCreature implements IAnimals
{
	private int attackTimer;
	
	public EntitySnowWolfMinion(World worldIn) {
		super (worldIn);
		this.setSize(0.6F, 0.85F);
		this.experienceValue = 3;
		
		
		
	}
	
	@Override
	protected void initEntityAI() 
	{
		
		this.tasks.addTask(10, new EntityAIAttackMelee(this, 0.6D, true));
		this.tasks.addTask(3, new EntityAIMoveTowardsTarget(this, 0.6D, 10.0F));
		this.tasks.addTask(30, new EntityAIWanderAvoidWater(this, 0.5D));
		this.tasks.addTask(5, new EntityAIWatchClosest(this, EntityPlayer.class, 10F));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true, new Class[]{EntityPigZombie.class}));
                
	
		
		
	}
	
	@Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        if (this.attackTimer > 0) {
            --this.attackTimer;


        }}
        
        @Override
        protected void applyEntityAttributes() {
            super.applyEntityAttributes();
            this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(15.0D);
            this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(15.0D);
            this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.6D);

        }
        
        @Override
        public float getEyeHeight() {
            return 1.74F;

        }
        
        @Override
        public boolean attackEntityAsMob(Entity entityIn) {
            this.attackTimer = 10;
            this.playSound(SoundEvents.ENTITY_WOLF_GROWL, 1.0F, 1.0F);
            return entityIn.attackEntityFrom(DamageSource.causeMobDamage(this), (float)(3 + this.rand.nextInt(3)));
            
        }
        protected SoundEvent getAmbientSound()
	    {
	        return SoundsHandler.ENTITIES_SNOW_WOLF_MINION_AMBIENT;
	    }
        protected SoundEvent getHurtSound(DamageSource damageSourceIn)
        {
        	return SoundEvents.ENTITY_WOLF_GROWL;
        	
        }
        protected SoundEvent getDeathSound()
        {
        	return SoundEvents.ENTITY_WOLF_GROWL;
        }
        }

