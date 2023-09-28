package net.termiteqc.sewingsmod.entity.animation;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.goal.EatBlockGoal;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;

public class ModEatBlockGoal extends EatBlockGoal {

    private final Mob mob;
    private int eatAnimationTick;
    private Level level;

    @Override
    public boolean canUse() {
        if (this.mob.getRandom().nextInt(this.mob.isBaby() ? 50 : 1000) != 0) {
            return false;
        } else {
            BlockPos blockpos = this.mob.blockPosition();

                return this.level.getBlockState(blockpos.below()).is(Blocks.GRASS_BLOCK);
            }
        }


    @Override
    public void tick() {
        this.eatAnimationTick = Math.max(0, this.eatAnimationTick - 1);
        if (this.eatAnimationTick == this.adjustedTickDelay(4)) {
            BlockPos blockpos = this.mob.blockPosition();
                if (net.minecraftforge.event.ForgeEventFactory.getMobGriefingEvent(this.level, this.mob)) {
                    this.level.destroyBlock(blockpos, false);
                }

                this.mob.ate();

                }
            }



    public ModEatBlockGoal(Mob pMob) {
        super(pMob);
        this.mob = pMob;
    }
}
