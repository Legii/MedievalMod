Stream.of(
Block.box(0, 0.01, 1, 7, 7.01, 15),
Block.box(0, 7.01, 1, 5, 10.01, 15),
Block.box(11, 7.01, 1, 16, 10.01, 15),
Block.box(0, 10.01, 1, 7, 15.01, 15),
Block.box(7, 0.01, 1, 9, 2.01, 15),
Block.box(7, 14.01, 1, 9, 15.01, 15),
Block.box(9, 0.01, 1, 16, 7.01, 15),
Block.box(9, 10.01, 1, 16, 15.01, 15),
Block.box(0, 0, 0, 16, 0.01, 16),
Block.box(0, 15, 1, 16, 16, 15),
Block.box(1, 1, 0, 7, 4, 1),
Block.box(0, 13, 0, 4, 16, 1),
Block.box(0, 5, 0, 4, 8, 1),
Block.box(13, 5, 0, 16, 8, 1),
Block.box(13, 13, 0, 16, 16, 1),
Block.box(5, 13, 0, 7, 16, 1),
Block.box(9, 13, 0, 12, 16, 1),
Block.box(11, 9, 0, 16, 12, 1),
Block.box(9, 1, 0, 16, 4, 1),
Block.box(1, 9, 0, 5, 12, 1),
Block.box(11, 9, 15, 15, 12, 16),
Block.box(1, 9, 15, 5, 12, 16),
Block.box(5, 5, 0, 7, 8, 1),
Block.box(9, 5, 0, 11, 8, 1),
Block.box(1, 1, 15, 7, 4, 16),
Block.box(0, 13, 15, 4, 16, 16),
Block.box(0, 5, 15, 4, 8, 16),
Block.box(13, 5, 15, 16, 8, 16),
Block.box(13, 13, 15, 16, 16, 16),
Block.box(9, 13, 15, 12, 16, 16),
Block.box(5, 13, 15, 7, 16, 16),
Block.box(9, 1, 15, 16, 4, 16)
).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get();