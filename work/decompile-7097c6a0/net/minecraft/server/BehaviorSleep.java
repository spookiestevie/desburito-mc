package net.minecraft.server;

import com.google.common.collect.ImmutableMap;
import java.util.Objects;
import java.util.Optional;

public class BehaviorSleep extends Behavior<EntityLiving> {

    private long a;

    public BehaviorSleep() {
        super(ImmutableMap.of(MemoryModuleType.HOME, MemoryStatus.VALUE_PRESENT));
    }

    @Override
    protected boolean a(WorldServer worldserver, EntityLiving entityliving) {
        if (entityliving.isPassenger()) {
            return false;
        } else {
            GlobalPos globalpos = (GlobalPos) entityliving.getBehaviorController().getMemory(MemoryModuleType.HOME).get();

            if (!Objects.equals(worldserver.getWorldProvider().getDimensionManager(), globalpos.getDimensionManager())) {
                return false;
            } else {
                IBlockData iblockdata = worldserver.getType(globalpos.getBlockPosition());

                return globalpos.getBlockPosition().a((IPosition) entityliving.ci(), 2.0D) && iblockdata.getBlock().a(TagsBlock.BEDS) && !(Boolean) iblockdata.get(BlockBed.OCCUPIED);
            }
        }
    }

    @Override
    protected boolean g(WorldServer worldserver, EntityLiving entityliving, long i) {
        Optional<GlobalPos> optional = entityliving.getBehaviorController().getMemory(MemoryModuleType.HOME);

        if (!optional.isPresent()) {
            return false;
        } else {
            BlockPosition blockposition = ((GlobalPos) optional.get()).getBlockPosition();

            return entityliving.getBehaviorController().c(Activity.REST) && entityliving.locY > (double) blockposition.getY() + 0.4D && blockposition.a((IPosition) entityliving.ci(), 1.14D);
        }
    }

    @Override
    protected void a(WorldServer worldserver, EntityLiving entityliving, long i) {
        if (i > this.a) {
            entityliving.e(((GlobalPos) entityliving.getBehaviorController().getMemory(MemoryModuleType.HOME).get()).getBlockPosition());
        }

    }

    @Override
    protected boolean a(long i) {
        return false;
    }

    @Override
    protected void f(WorldServer worldserver, EntityLiving entityliving, long i) {
        if (entityliving.isSleeping()) {
            entityliving.dz();
            this.a = i + 40L;
        }

    }
}
