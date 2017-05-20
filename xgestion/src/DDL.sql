-- ----------------------------
-- Records of ma_empresas
-- ----------------------------
BEGIN;
INSERT INTO `ma_empresas` VALUES ('1', '', '','','',null,'MI EMPRESA','');
COMMIT;

-- ----------------------------
-- Records of ma_sucursales
-- ----------------------------
BEGIN;
INSERT INTO `ma_sucursales` VALUES ('1', '', 'MI SUCURSAL');
COMMIT;

-- ----------------------------
-- Records of ma_computadoras
-- ----------------------------
BEGIN;
INSERT INTO `ma_computadoras` VALUES ('1', '', 'MI COMPUTADORA');
COMMIT;

-- ----------------------------
-- Records of ma_turnos
-- ----------------------------
BEGIN;
INSERT INTO `ma_turnos` VALUES ('1', '','01:00:00','23:59:59', 'MI TURNO');
COMMIT;

-- ----------------------------
-- Records of ma_movimiento_tipo
-- ----------------------------
BEGIN;
INSERT INTO `ma_movimiento_tipo` VALUES ('1', '', 'EMPRESA'), ('2', '', 'SUCURSAL'), ('3', '', 'COMPUTADORA'), ('4', '', 'USUARIOS'), ('5', '', 'PRODUCTOS PRECIO'), ('6', '', 'PRODUCTOS STOCK'), ('7', '', 'CLIENTES'), ('8', '', 'FAMILIAS'), ('10', '', 'PROVEEDORES'), ('11', '', 'UBICACIONES'), ('12', '', 'OFERTAS'), ('13', '', 'VENTAS'), ('14', '', 'COMPRAS'), ('15', '', 'CC CLIENTES'), ('16', '', 'CC PROVEEDORES'),('17', '', 'SUBFAMILIAS');
COMMIT;

-- ----------------------------
-- Records of ma_movimientos_codigos
-- ----------------------------
BEGIN;
INSERT INTO `ma_movimientos_codigos` VALUES ('101', '', 'PRODUCCIÓN', ''), ('102', '', 'ANULA PRODUCCIÓN', ''), ('121', '', 'ENTREGA POR PROVEEDOR', ''), ('122', '', 'ANULA ENTREGA PROVEEDOR', ''), ('261', '', 'CONSUMO', ''), ('262', '', 'ANULA CONSUMO', ''), ('301', '', 'TRANSFERENCIA', ''), ('302', '', 'ANULA TRANSFERENCIA', ''), ('501', '', 'MERCADERIA INICIAL', ''), ('502', '', 'ANULA MERCADERIA INICIAL', ''), ('601', '', 'VENTA', ''), ('602', '', 'ANULA VENTA', ''), ('701', '', 'AJUSTE STOCK POSITIVO', ''), ('702', '', 'ANULA AJUSTE STOCK POSITIVO', ''), ('703', '', 'AJUSTE STOCK NEGATIVO', ''), ('704', '', 'ANULA AJUSTE STOCK NEGATIVO', ''), ('801', '', 'ABASTECIMIENTO POSITIVO', ''), ('802', '', 'ANULA ABASTECIMIENTO POSITIVO', ''), ('803', '', 'ABASTECIMIENTO NEGATIVO', ''), ('804', '', 'ANULA ABASTECIMIENTO NEGATIVO', ''), ('901', '', 'COMPRA', ''), ('902', '', 'ANULA COMPRA', ''), ('950', '', 'AJUSTE PRECIO', ''), ('999', '', 'CIERRE ANUAL STOCK', '');
COMMIT;

-- ----------------------------
-- Records of ma_pagos
-- ----------------------------
BEGIN;
INSERT INTO `ma_pagos` VALUES ('1', '', '0', 'Efectivo'), ('2', '', '0', 'T. Debito'), ('3', '', '0', 'T. Credito');
COMMIT;

-- ----------------------------
-- Records of ma_umes
-- ----------------------------
BEGIN;
INSERT INTO `ma_umes` VALUES ('1', '', 'UN'), ('2', '', 'MT');
COMMIT;

-- ----------------------------
-- Records of ma_usuarios
-- ----------------------------
BEGIN;
INSERT INTO `ma_usuarios` VALUES ('1', '', 'NINGUNO', 'NINGUNO', '', '');
COMMIT;

-- ----------------------------
-- Records of ma_clientes
-- ----------------------------
BEGIN;
INSERT INTO `ma_clientes` VALUES ('1', '', '', '', '', '','Consumidor Final','');
COMMIT;

-- ----------------------------
-- Records of ma_productos
-- ----------------------------
BEGIN;
INSERT INTO `ma_productos` VALUES ('1', '', '', '', '', '','Consumidor Final','');
COMMIT;


-- ----------------------------
-- Auto increment value for `ma_movimiento_tipo`
-- ----------------------------
ALTER TABLE `ma_movimiento_tipo` AUTO_INCREMENT=1000;

-- ----------------------------
-- Auto increment value for `ma_movimientos_codigos`
-- ----------------------------
ALTER TABLE `ma_movimientos_codigos` AUTO_INCREMENT=1000;

-- ----------------------------
-- Auto increment value for `ma_pagos`
-- ----------------------------
ALTER TABLE `ma_pagos` AUTO_INCREMENT=4;

-- ----------------------------
-- Auto increment value for `ma_umes`
-- ----------------------------
ALTER TABLE `ma_umes` AUTO_INCREMENT=3;

-- ----------------------------
-- Auto increment value for `ma_usuarios`
-- ----------------------------
ALTER TABLE `ma_usuarios` AUTO_INCREMENT=2;

-- ----------------------------
-- Auto increment value for `ma_clientes`
-- ----------------------------
ALTER TABLE `ma_clientes` AUTO_INCREMENT=2;

-- ----------------------------
-- Auto increment value for `ma_empresas`
-- ----------------------------
ALTER TABLE `ma_empresas` AUTO_INCREMENT=2;

-- ----------------------------
-- Auto increment value for `ma_sucursales`
-- ----------------------------
ALTER TABLE `ma_sucursales` AUTO_INCREMENT=2;

-- ----------------------------
-- Auto increment value for `ma_computadoras`
-- ----------------------------
ALTER TABLE `ma_computadoras` AUTO_INCREMENT=2;

-- ----------------------------
-- Auto increment value for `ma_turnos`
-- ----------------------------
ALTER TABLE `ma_turnos` AUTO_INCREMENT=2;
