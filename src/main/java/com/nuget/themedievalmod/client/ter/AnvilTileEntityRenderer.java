package com.nuget.themedievalmod.client.ter;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.nuget.themedievalmod.common.tileentities.AnvilTileEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.LightTexture;
import net.minecraft.client.renderer.model.IBakedModel;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Matrix4f;
import net.minecraft.util.math.vector.Quaternion;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.LightType;
import net.minecraft.world.World;

public class AnvilTileEntityRenderer extends TileEntityRenderer<AnvilTileEntity> {
    private Minecraft mc = Minecraft.getInstance();


    public AnvilTileEntityRenderer(TileEntityRendererDispatcher rendererDispatcherIn) {
        super(rendererDispatcherIn);
    }



    @java.lang.Override
    public void render(AnvilTileEntity te, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int combinedLightIn, int combinedOverlayIn) {
        if(te.getItem().equals(ItemStack.EMPTY)) return;
        ClientPlayerEntity player = mc.player;
        int LightLevel = getLightLevel(te.getWorld(),te.getPos().up());

        renderItem(te.getItem(),new double[]{0.5d,1d,0.5d}, Vector3f.XP.rotationDegrees(90f),matrixStackIn,bufferIn,partialTicks,combinedOverlayIn,LightLevel,1.2f);

//        ITextComponent label = te.getItem().hasDisplayName() ? te.getItem().getDisplayName() :new TranslationTextComponent(te.getItem().getTranslationKey());
//        renderLabel(matrixStackIn,bufferIn,LightLevel,new double[]{.5d,1.3d,.5d},label,0xffffff);
    }
    private void renderItem(ItemStack stack, double[] translation, Quaternion rotation,MatrixStack matrixStack,IRenderTypeBuffer buffer,float partialTicks,int combinedOverlay, int LightLevel,float scale) {

        matrixStack.push();
        matrixStack.translate(translation[0],translation[1],translation[2]);
        matrixStack.rotate(rotation);
        matrixStack.scale(scale,scale,scale);
        IBakedModel model = mc.getItemRenderer().getItemModelWithOverrides(stack,null,null);
        mc.getItemRenderer().renderItem(stack, ItemCameraTransforms.TransformType.GROUND,true,matrixStack,buffer,LightLevel,combinedOverlay,model);
        matrixStack.pop();
    }
//    private void renderLabel(MatrixStack stack, IRenderTypeBuffer buffer, int LightLevel, double[] corner, ITextComponent text, int color) {
//        FontRenderer font = mc.fontRenderer;
//
//        stack.push();
//        float scale =0.01f;
//        int opacity = (int) (0.4f*255.0f) <<24;
//        float offset = (float)(-font.getStringPropertyWidth(text)/2);
//        Matrix4f matrix = stack.getLast().getMatrix();
//        stack.translate(corner[0],corner[1]*0.4f,corner[2]);
//        stack.scale(scale,scale,scale);
//        stack.rotate(mc.getRenderManager().getCameraOrientation());
//        stack.rotate(Vector3f.ZP.rotationDegrees(180f));
//        font.func_243247_a(text,offset,0,color,false, matrix,buffer,false,opacity,LightLevel);
//        stack.pop();
//
//    }


    private int getLightLevel(World world, BlockPos pos) {
        int bLight = world.getLightFor(LightType.BLOCK,pos);
        int sLight = world.getLightFor(LightType.SKY,pos);
        return LightTexture.packLight(bLight,sLight);
    }

}
