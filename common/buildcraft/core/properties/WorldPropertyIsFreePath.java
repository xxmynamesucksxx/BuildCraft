package buildcraft.core.properties;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class WorldPropertyIsFreePath extends WorldProperty {
    @Override
    public boolean get(IBlockAccess world, IBlockState state, BlockPos pos) {
        Block block = state.getBlock();
        return block.isPassable(world, pos);
    }
}
