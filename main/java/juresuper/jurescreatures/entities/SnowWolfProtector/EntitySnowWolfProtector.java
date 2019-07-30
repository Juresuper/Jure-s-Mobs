package juresuper.jurescreatures.entities.SnowWolfProtector;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.passive.IAnimals;
import net.minecraft.world.World;

public class EntitySnowWolfProtector extends EntityCreature implements IAnimals
{
	private int attackTimer;
	
	public EntitySnowWolfProtector(World worldIn) 
	{
		super (worldIn);
		this.setSize(3.0F, 0.5F);
		this.experienceValue = 3;		
}
	@Override
	protected void initEntityAI() 
	{
		this.tasks.addTask(30, new EntityAIWanderAvoidWater(this, 0.5D));

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
            this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(100.0D);
            this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(25.0D);
            this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.5D);

        }
        @Override
        public float getEyeHeight() {
            return 1.74F;
        }}
