package com.wailord444.wailsmod.entity;

import com.wailord444.wailsmod.util.handlers.LootTableHandler;

import com.wailord444.wailsmod.util.handlers.SoundsHandler;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityBrewer extends EntityZombie
{

	public EntityBrewer(World worldIn) 
	{
		super(worldIn);
	}
	
	@Override
	protected void applyEntityAttributes() 
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.35000000417232513D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(4.0D);
        this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(2.0D);
	}
	
	@Override
	protected ResourceLocation getLootTable() 
	{
		return LootTableHandler.BREWER;
	}
	
	@Override
	protected SoundEvent getAmbientSound() 
	{
		return SoundsHandler.ONIT;
	}
	
	@Override
	protected SoundEvent getHurtSound(DamageSource damageSourceIn) 
	{
		return SoundsHandler.GOTEM_ONIT;
	}
	
	@Override
	protected SoundEvent getDeathSound() 
	{
		return SoundsHandler.LONG_ONIT;
	}
}
