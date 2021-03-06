package com.icearrow26.moreapples.minecart;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.scoreboard.Team.CollisionRule;
import net.minecraftforge.event.entity.living.ZombieEvent;
import net.minecraftforge.event.entity.minecart.MinecartCollisionEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ExplodingMinecart {
	@SubscribeEvent
	public void explode(MinecartCollisionEvent event) {
		EntityMinecart minecart = event.getMinecart();
		minecart.world.createExplosion(minecart, minecart.posX, minecart.posY, minecart.posZ, 2, false);
	}
}
