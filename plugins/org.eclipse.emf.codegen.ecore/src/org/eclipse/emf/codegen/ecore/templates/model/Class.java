package org.eclipse.emf.codegen.ecore.templates.model;

import java.util.*;
import org.eclipse.emf.codegen.ecore.genmodel.*;

public class Class
{
  protected final String NL = System.getProperties().getProperty("line.separator");
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = "/**" + NL + " * <copyright>" + NL + " * </copyright>" + NL + " *" + NL + " * ";
  protected final String TEXT_3 = "Id";
  protected final String TEXT_4 = NL + " */" + NL + "package ";
  protected final String TEXT_5 = ";" + NL;
  protected final String TEXT_6 = NL + NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * An implementation of the model object '<em><b>";
  protected final String TEXT_7 = "</b></em>'." + NL + " * <!-- end-user-doc -->" + NL + " * <p>";
  protected final String TEXT_8 = NL + " * The following features are implemented:" + NL + " * <ul>";
  protected final String TEXT_9 = NL + " *   <li>{@link ";
  protected final String TEXT_10 = "#";
  protected final String TEXT_11 = " <em>";
  protected final String TEXT_12 = "</em>}</li>";
  protected final String TEXT_13 = NL + " * </ul>";
  protected final String TEXT_14 = NL + " * </p>" + NL + " *" + NL + " * @generated" + NL + " */" + NL + "public";
  protected final String TEXT_15 = " abstract";
  protected final String TEXT_16 = " class ";
  protected final String TEXT_17 = NL + "{";
  protected final String TEXT_18 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static final ";
  protected final String TEXT_19 = " copyright = \"";
  protected final String TEXT_20 = "\";";
  protected final String TEXT_21 = NL;
  protected final String TEXT_22 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static final ";
  protected final String TEXT_23 = " mofDriverNumber = \"";
  protected final String TEXT_24 = "\";";
  protected final String TEXT_25 = NL;
  protected final String TEXT_26 = NL + "\t/**" + NL + "\t * The cached value of the '{@link #";
  protected final String TEXT_27 = "() <em>";
  protected final String TEXT_28 = "</em>}' ";
  protected final String TEXT_29 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_30 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_31 = " ";
  protected final String TEXT_32 = " = null;" + NL;
  protected final String TEXT_33 = NL + "\t/**" + NL + "\t * The default value of the '{@link #";
  protected final String TEXT_34 = "() <em>";
  protected final String TEXT_35 = "</em>}' ";
  protected final String TEXT_36 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_37 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_38 = NL + "\tprotected static final ";
  protected final String TEXT_39 = " ";
  protected final String TEXT_40 = "_EDEFAULT = ";
  protected final String TEXT_41 = ";";
  protected final String TEXT_42 = NL + "\tprotected static final ";
  protected final String TEXT_43 = " ";
  protected final String TEXT_44 = "_EDEFAULT = ";
  protected final String TEXT_45 = "(";
  protected final String TEXT_46 = "(";
  protected final String TEXT_47 = ")";
  protected final String TEXT_48 = ".eINSTANCE.createFromString(";
  protected final String TEXT_49 = ".eINSTANCE.get";
  protected final String TEXT_50 = "(), ";
  protected final String TEXT_51 = ")";
  protected final String TEXT_52 = ").";
  protected final String TEXT_53 = "Value()";
  protected final String TEXT_54 = ";";
  protected final String TEXT_55 = NL + "\tprotected static final ";
  protected final String TEXT_56 = " ";
  protected final String TEXT_57 = "_EDEFAULT = null;";
  protected final String TEXT_58 = NL + NL + "\t/**" + NL + "\t * The cached value of the '{@link #";
  protected final String TEXT_59 = "() <em>";
  protected final String TEXT_60 = "</em>}' ";
  protected final String TEXT_61 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_62 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_63 = " ";
  protected final String TEXT_64 = " = ";
  protected final String TEXT_65 = "_EDEFAULT;" + NL;
  protected final String TEXT_66 = NL + "\t/**" + NL + "\t * This is true if the ";
  protected final String TEXT_67 = " ";
  protected final String TEXT_68 = " has been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected boolean ";
  protected final String TEXT_69 = "ESet = false;" + NL;
  protected final String TEXT_70 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_71 = "()" + NL + "\t{" + NL + "\t\tsuper();" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_72 = " eStaticClass()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_73 = ".eINSTANCE.get";
  protected final String TEXT_74 = "();" + NL + "\t}" + NL;
  protected final String TEXT_75 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_76 = " ";
  protected final String TEXT_77 = "()" + NL + "\t{";
  protected final String TEXT_78 = NL + "\t\treturn ";
  protected final String TEXT_79 = "(";
  protected final String TEXT_80 = "(";
  protected final String TEXT_81 = ")eGet(";
  protected final String TEXT_82 = ".eINSTANCE.get";
  protected final String TEXT_83 = "(), true)";
  protected final String TEXT_84 = ").";
  protected final String TEXT_85 = "()";
  protected final String TEXT_86 = ";";
  protected final String TEXT_87 = NL + "\t\tif (";
  protected final String TEXT_88 = " == null)" + NL + "\t\t{";
  protected final String TEXT_89 = NL + "\t\t\t";
  protected final String TEXT_90 = " = new ";
  protected final String TEXT_91 = "(";
  protected final String TEXT_92 = ".eINSTANCE.get";
  protected final String TEXT_93 = "(), ";
  protected final String TEXT_94 = ".class, this, ";
  protected final String TEXT_95 = ");";
  protected final String TEXT_96 = NL + "\t\t\t";
  protected final String TEXT_97 = " = new ";
  protected final String TEXT_98 = "(";
  protected final String TEXT_99 = ".class, this, ";
  protected final String TEXT_100 = ", ";
  protected final String TEXT_101 = ");";
  protected final String TEXT_102 = NL + "\t\t\t";
  protected final String TEXT_103 = " = new ";
  protected final String TEXT_104 = "(";
  protected final String TEXT_105 = ".class, this, ";
  protected final String TEXT_106 = ");";
  protected final String TEXT_107 = NL + "\t\t\t";
  protected final String TEXT_108 = " = new ";
  protected final String TEXT_109 = ".ManyInverse(";
  protected final String TEXT_110 = ".class, this, ";
  protected final String TEXT_111 = ", ";
  protected final String TEXT_112 = ");";
  protected final String TEXT_113 = NL + "\t\t\t";
  protected final String TEXT_114 = " = new ";
  protected final String TEXT_115 = ".ManyInverse(";
  protected final String TEXT_116 = ".class, this, ";
  protected final String TEXT_117 = ", ";
  protected final String TEXT_118 = ");";
  protected final String TEXT_119 = NL + "\t\t\t";
  protected final String TEXT_120 = " = new ";
  protected final String TEXT_121 = "(";
  protected final String TEXT_122 = ".class, this, ";
  protected final String TEXT_123 = ", ";
  protected final String TEXT_124 = ");";
  protected final String TEXT_125 = NL + "\t\t\t";
  protected final String TEXT_126 = " = new ";
  protected final String TEXT_127 = "(";
  protected final String TEXT_128 = ".class, this, ";
  protected final String TEXT_129 = ", ";
  protected final String TEXT_130 = ");";
  protected final String TEXT_131 = NL + "\t\t\t";
  protected final String TEXT_132 = " = new ";
  protected final String TEXT_133 = "(";
  protected final String TEXT_134 = ".class, this, ";
  protected final String TEXT_135 = ");";
  protected final String TEXT_136 = NL + "\t\t\t";
  protected final String TEXT_137 = " = new ";
  protected final String TEXT_138 = "(";
  protected final String TEXT_139 = ".class, this, ";
  protected final String TEXT_140 = ");";
  protected final String TEXT_141 = NL + "\t\t\t";
  protected final String TEXT_142 = " = new ";
  protected final String TEXT_143 = "(new ";
  protected final String TEXT_144 = "(this, ";
  protected final String TEXT_145 = "));";
  protected final String TEXT_146 = NL + "\t\t\t";
  protected final String TEXT_147 = " = new ";
  protected final String TEXT_148 = "(this, ";
  protected final String TEXT_149 = ");";
  protected final String TEXT_150 = NL + "\t\t\t";
  protected final String TEXT_151 = " = new ";
  protected final String TEXT_152 = "(";
  protected final String TEXT_153 = ".class, this, ";
  protected final String TEXT_154 = ");";
  protected final String TEXT_155 = NL + "\t\t\t";
  protected final String TEXT_156 = " = new ";
  protected final String TEXT_157 = "(";
  protected final String TEXT_158 = ".class, this, ";
  protected final String TEXT_159 = ");";
  protected final String TEXT_160 = NL + "\t\t}" + NL + "\t\treturn ";
  protected final String TEXT_161 = ";";
  protected final String TEXT_162 = NL + "\t\tif (eContainerFeatureID != ";
  protected final String TEXT_163 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_164 = ")eContainer;";
  protected final String TEXT_165 = NL + "\t\tif (";
  protected final String TEXT_166 = " != null && ";
  protected final String TEXT_167 = ".eIsProxy())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_168 = " old";
  protected final String TEXT_169 = " = ";
  protected final String TEXT_170 = ";" + NL + "\t\t\t";
  protected final String TEXT_171 = " = (";
  protected final String TEXT_172 = ")eResolveProxy((";
  protected final String TEXT_173 = ")";
  protected final String TEXT_174 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_175 = " != old";
  protected final String TEXT_176 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\t\teNotify(new ";
  protected final String TEXT_177 = "(this, ";
  protected final String TEXT_178 = ".RESOLVE, ";
  protected final String TEXT_179 = ", old";
  protected final String TEXT_180 = ", ";
  protected final String TEXT_181 = "));" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_182 = NL + "\t\treturn ";
  protected final String TEXT_183 = ";";
  protected final String TEXT_184 = NL + "\t\t";
  protected final String TEXT_185 = " ";
  protected final String TEXT_186 = " = basicGet";
  protected final String TEXT_187 = "();" + NL + "\t\treturn ";
  protected final String TEXT_188 = " == null ? null : (";
  protected final String TEXT_189 = ")eResolveProxy((";
  protected final String TEXT_190 = ")";
  protected final String TEXT_191 = ");";
  protected final String TEXT_192 = NL + "\t\treturn new ";
  protected final String TEXT_193 = "((";
  protected final String TEXT_194 = ")((";
  protected final String TEXT_195 = ")get";
  protected final String TEXT_196 = "()).featureMap().list(";
  protected final String TEXT_197 = "()));";
  protected final String TEXT_198 = NL + "\t\treturn (";
  protected final String TEXT_199 = ")((";
  protected final String TEXT_200 = ")get";
  protected final String TEXT_201 = "()).list(";
  protected final String TEXT_202 = "());";
  protected final String TEXT_203 = NL + "\t\treturn ((";
  protected final String TEXT_204 = ")get";
  protected final String TEXT_205 = "()).featureMap().list(";
  protected final String TEXT_206 = "());";
  protected final String TEXT_207 = NL + "\t\treturn ((";
  protected final String TEXT_208 = ")get";
  protected final String TEXT_209 = "()).list(";
  protected final String TEXT_210 = "());";
  protected final String TEXT_211 = NL + "\t\treturn ";
  protected final String TEXT_212 = "(";
  protected final String TEXT_213 = "(";
  protected final String TEXT_214 = ")((";
  protected final String TEXT_215 = ")get";
  protected final String TEXT_216 = "()).featureMap().get(";
  protected final String TEXT_217 = "(), true)";
  protected final String TEXT_218 = ").";
  protected final String TEXT_219 = "()";
  protected final String TEXT_220 = ";";
  protected final String TEXT_221 = NL + "\t\treturn ";
  protected final String TEXT_222 = "(";
  protected final String TEXT_223 = "(";
  protected final String TEXT_224 = ")get";
  protected final String TEXT_225 = "().get(";
  protected final String TEXT_226 = "(), true)";
  protected final String TEXT_227 = ").";
  protected final String TEXT_228 = "()";
  protected final String TEXT_229 = ";";
  protected final String TEXT_230 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_231 = "' ";
  protected final String TEXT_232 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_233 = NL + "\t}" + NL;
  protected final String TEXT_234 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_235 = " basicGet";
  protected final String TEXT_236 = "()" + NL + "\t{";
  protected final String TEXT_237 = NL + "\t\treturn ";
  protected final String TEXT_238 = ";";
  protected final String TEXT_239 = NL + "\t\treturn (";
  protected final String TEXT_240 = ")((";
  protected final String TEXT_241 = ")get";
  protected final String TEXT_242 = "()).featureMap().get(";
  protected final String TEXT_243 = "(), false);";
  protected final String TEXT_244 = NL + "\t\treturn (";
  protected final String TEXT_245 = ")get";
  protected final String TEXT_246 = "().get(";
  protected final String TEXT_247 = "(), false);";
  protected final String TEXT_248 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_249 = "' ";
  protected final String TEXT_250 = NL + "\t\t// -> do not perform proxy resolution" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_251 = NL + "\t}" + NL;
  protected final String TEXT_252 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_253 = " basicSet";
  protected final String TEXT_254 = "(";
  protected final String TEXT_255 = " new";
  protected final String TEXT_256 = ", ";
  protected final String TEXT_257 = " msgs)" + NL + "\t{";
  protected final String TEXT_258 = NL + "\t\t";
  protected final String TEXT_259 = " old";
  protected final String TEXT_260 = " = ";
  protected final String TEXT_261 = ";" + NL + "\t\t";
  protected final String TEXT_262 = " = new";
  protected final String TEXT_263 = ";";
  protected final String TEXT_264 = NL + "\t\tboolean old";
  protected final String TEXT_265 = "ESet = ";
  protected final String TEXT_266 = "ESet;" + NL + "\t\t";
  protected final String TEXT_267 = "ESet = true;";
  protected final String TEXT_268 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{";
  protected final String TEXT_269 = NL + "\t\t\t";
  protected final String TEXT_270 = " notification = new ";
  protected final String TEXT_271 = "(this, ";
  protected final String TEXT_272 = ".SET, ";
  protected final String TEXT_273 = ", old";
  protected final String TEXT_274 = ", new";
  protected final String TEXT_275 = ", !old";
  protected final String TEXT_276 = "ESet);";
  protected final String TEXT_277 = NL + "\t\t\t";
  protected final String TEXT_278 = " notification = new ";
  protected final String TEXT_279 = "(this, ";
  protected final String TEXT_280 = ".SET, ";
  protected final String TEXT_281 = ", old";
  protected final String TEXT_282 = ", new";
  protected final String TEXT_283 = ");";
  protected final String TEXT_284 = NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}" + NL + "\t\treturn msgs;";
  protected final String TEXT_285 = NL + "\t\treturn ((";
  protected final String TEXT_286 = ".Internal)((";
  protected final String TEXT_287 = ")get";
  protected final String TEXT_288 = "()).featureMap()).basicAdd(";
  protected final String TEXT_289 = "(), new";
  protected final String TEXT_290 = ", null);";
  protected final String TEXT_291 = NL + "\t\treturn ((";
  protected final String TEXT_292 = ".Internal)get";
  protected final String TEXT_293 = "()).basicAdd(";
  protected final String TEXT_294 = "(), new";
  protected final String TEXT_295 = ", null);";
  protected final String TEXT_296 = NL + "\t\t// TODO: implement this method to set the contained '";
  protected final String TEXT_297 = "' ";
  protected final String TEXT_298 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_299 = NL + "\t}" + NL;
  protected final String TEXT_300 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void set";
  protected final String TEXT_301 = "(";
  protected final String TEXT_302 = " new";
  protected final String TEXT_303 = ")" + NL + "\t{";
  protected final String TEXT_304 = NL + "\t\teSet(";
  protected final String TEXT_305 = ".eINSTANCE.get";
  protected final String TEXT_306 = "(), ";
  protected final String TEXT_307 = "new ";
  protected final String TEXT_308 = "(";
  protected final String TEXT_309 = "new";
  protected final String TEXT_310 = ")";
  protected final String TEXT_311 = ");";
  protected final String TEXT_312 = NL + "\t\tif (new";
  protected final String TEXT_313 = " != eContainer || (eContainerFeatureID != ";
  protected final String TEXT_314 = " && new";
  protected final String TEXT_315 = " != null))" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_316 = ".isAncestor(this, ";
  protected final String TEXT_317 = "new";
  protected final String TEXT_318 = "))" + NL + "\t\t\t\tthrow new ";
  protected final String TEXT_319 = "(\"Recursive containment not allowed for \" + toString());";
  protected final String TEXT_320 = NL + "\t\t\t";
  protected final String TEXT_321 = " msgs = null;" + NL + "\t\t\tif (eContainer != null)" + NL + "\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_322 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_323 = ")new";
  protected final String TEXT_324 = ").eInverseAdd(this, ";
  protected final String TEXT_325 = ", ";
  protected final String TEXT_326 = ".class, msgs);" + NL + "\t\t\tmsgs = eBasicSetContainer((";
  protected final String TEXT_327 = ")new";
  protected final String TEXT_328 = ", ";
  protected final String TEXT_329 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}" + NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_330 = "(this, ";
  protected final String TEXT_331 = ".SET, ";
  protected final String TEXT_332 = ", new";
  protected final String TEXT_333 = ", new";
  protected final String TEXT_334 = "));";
  protected final String TEXT_335 = NL + "\t\tif (new";
  protected final String TEXT_336 = " != ";
  protected final String TEXT_337 = ")" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_338 = " msgs = null;" + NL + "\t\t\tif (";
  protected final String TEXT_339 = " != null)";
  protected final String TEXT_340 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_341 = ")";
  protected final String TEXT_342 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_343 = ", null, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_344 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_345 = ")new";
  protected final String TEXT_346 = ").eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_347 = ", null, msgs);";
  protected final String TEXT_348 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_349 = ")";
  protected final String TEXT_350 = ").eInverseRemove(this, ";
  protected final String TEXT_351 = ", ";
  protected final String TEXT_352 = ".class, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_353 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_354 = ")new";
  protected final String TEXT_355 = ").eInverseAdd(this, ";
  protected final String TEXT_356 = ", ";
  protected final String TEXT_357 = ".class, msgs);";
  protected final String TEXT_358 = NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_359 = "(";
  protected final String TEXT_360 = "new";
  protected final String TEXT_361 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_362 = NL + "\t\telse" + NL + "    \t{" + NL + "\t\t\tboolean old";
  protected final String TEXT_363 = "ESet = ";
  protected final String TEXT_364 = "ESet;" + NL + "\t\t\t";
  protected final String TEXT_365 = "ESet = true;" + NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_366 = "(this, ";
  protected final String TEXT_367 = ".SET, ";
  protected final String TEXT_368 = ", new";
  protected final String TEXT_369 = ", new";
  protected final String TEXT_370 = ", !old";
  protected final String TEXT_371 = "ESet));" + NL + "    \t}";
  protected final String TEXT_372 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_373 = "(this, ";
  protected final String TEXT_374 = ".SET, ";
  protected final String TEXT_375 = ", new";
  protected final String TEXT_376 = ", new";
  protected final String TEXT_377 = "));";
  protected final String TEXT_378 = NL + "\t\t";
  protected final String TEXT_379 = " old";
  protected final String TEXT_380 = " = ";
  protected final String TEXT_381 = ";";
  protected final String TEXT_382 = NL + "\t\t";
  protected final String TEXT_383 = " = new";
  protected final String TEXT_384 = " == null ? ";
  protected final String TEXT_385 = "_EDEFAULT : new";
  protected final String TEXT_386 = ";";
  protected final String TEXT_387 = NL + "\t\t";
  protected final String TEXT_388 = " = ";
  protected final String TEXT_389 = "new";
  protected final String TEXT_390 = ";";
  protected final String TEXT_391 = NL + "\t\tboolean old";
  protected final String TEXT_392 = "ESet = ";
  protected final String TEXT_393 = "ESet;" + NL + "\t\t";
  protected final String TEXT_394 = "ESet = true;" + NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_395 = "(this, ";
  protected final String TEXT_396 = ".SET, ";
  protected final String TEXT_397 = ", old";
  protected final String TEXT_398 = ", ";
  protected final String TEXT_399 = ", !old";
  protected final String TEXT_400 = "ESet));";
  protected final String TEXT_401 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_402 = "(this, ";
  protected final String TEXT_403 = ".SET, ";
  protected final String TEXT_404 = ", old";
  protected final String TEXT_405 = ", ";
  protected final String TEXT_406 = "));";
  protected final String TEXT_407 = NL + "\t\t((";
  protected final String TEXT_408 = ".Internal)((";
  protected final String TEXT_409 = ")get";
  protected final String TEXT_410 = "()).featureMap()).set(";
  protected final String TEXT_411 = "(), ";
  protected final String TEXT_412 = "new ";
  protected final String TEXT_413 = "(";
  protected final String TEXT_414 = "new";
  protected final String TEXT_415 = ")";
  protected final String TEXT_416 = ");";
  protected final String TEXT_417 = NL + "\t\t((";
  protected final String TEXT_418 = ".Internal)get";
  protected final String TEXT_419 = "()).set(";
  protected final String TEXT_420 = "(), ";
  protected final String TEXT_421 = "new ";
  protected final String TEXT_422 = "(";
  protected final String TEXT_423 = "new";
  protected final String TEXT_424 = ")";
  protected final String TEXT_425 = ");";
  protected final String TEXT_426 = NL + "\t\t// TODO: implement this method to set the '";
  protected final String TEXT_427 = "' ";
  protected final String TEXT_428 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_429 = NL + "\t}" + NL;
  protected final String TEXT_430 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_431 = " basicUnset";
  protected final String TEXT_432 = "(";
  protected final String TEXT_433 = " msgs)" + NL + "\t{";
  protected final String TEXT_434 = NL + "\t\t";
  protected final String TEXT_435 = " old";
  protected final String TEXT_436 = " = ";
  protected final String TEXT_437 = ";" + NL + "\t\t";
  protected final String TEXT_438 = " = null;" + NL + "\t\tboolean old";
  protected final String TEXT_439 = "ESet = ";
  protected final String TEXT_440 = "ESet;" + NL + "\t\t";
  protected final String TEXT_441 = "ESet = false;" + NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_442 = " notification = new ";
  protected final String TEXT_443 = "(this, ";
  protected final String TEXT_444 = ".UNSET, ";
  protected final String TEXT_445 = ", old";
  protected final String TEXT_446 = ", null, old";
  protected final String TEXT_447 = "ESet);" + NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}" + NL + "\t\treturn msgs;";
  protected final String TEXT_448 = NL + "\t\t// TODO: implement this method to unset the contained '";
  protected final String TEXT_449 = "' ";
  protected final String TEXT_450 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_451 = NL + "\t}" + NL;
  protected final String TEXT_452 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void unset";
  protected final String TEXT_453 = "()" + NL + "\t{";
  protected final String TEXT_454 = NL + "\t\teUnset(";
  protected final String TEXT_455 = ".eINSTANCE.get";
  protected final String TEXT_456 = "());";
  protected final String TEXT_457 = NL + "\t\t((";
  protected final String TEXT_458 = ".Unsettable)get";
  protected final String TEXT_459 = "()).unset();";
  protected final String TEXT_460 = NL + "\t\tif (";
  protected final String TEXT_461 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_462 = " msgs = null;";
  protected final String TEXT_463 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_464 = ")";
  protected final String TEXT_465 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_466 = ", null, msgs);";
  protected final String TEXT_467 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_468 = ")";
  protected final String TEXT_469 = ").eInverseRemove(this, ";
  protected final String TEXT_470 = ", ";
  protected final String TEXT_471 = ".class, msgs);";
  protected final String TEXT_472 = NL + "\t\t\tmsgs = basicUnset";
  protected final String TEXT_473 = "(msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}" + NL + "\t\telse" + NL + "    \t{" + NL + "\t\t\tboolean old";
  protected final String TEXT_474 = "ESet = ";
  protected final String TEXT_475 = "ESet;" + NL + "\t\t\t";
  protected final String TEXT_476 = "ESet = false;" + NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_477 = "(this, ";
  protected final String TEXT_478 = ".UNSET, ";
  protected final String TEXT_479 = ", null, null, old";
  protected final String TEXT_480 = "ESet));" + NL + "    \t}";
  protected final String TEXT_481 = NL + "\t\t";
  protected final String TEXT_482 = " old";
  protected final String TEXT_483 = " = ";
  protected final String TEXT_484 = ";" + NL + "\t\tboolean old";
  protected final String TEXT_485 = "ESet = ";
  protected final String TEXT_486 = "ESet;";
  protected final String TEXT_487 = NL + "\t\t";
  protected final String TEXT_488 = " = null;" + NL + "\t\t";
  protected final String TEXT_489 = "ESet = false;" + NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_490 = "(this, ";
  protected final String TEXT_491 = ".UNSET, ";
  protected final String TEXT_492 = ", old";
  protected final String TEXT_493 = ", null, old";
  protected final String TEXT_494 = "ESet));";
  protected final String TEXT_495 = NL + "\t\t";
  protected final String TEXT_496 = " = ";
  protected final String TEXT_497 = "_EDEFAULT;" + NL + "\t\t";
  protected final String TEXT_498 = "ESet = false;" + NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_499 = "(this, ";
  protected final String TEXT_500 = ".UNSET, ";
  protected final String TEXT_501 = ", old";
  protected final String TEXT_502 = ", ";
  protected final String TEXT_503 = "_EDEFAULT, old";
  protected final String TEXT_504 = "ESet));";
  protected final String TEXT_505 = NL + "\t\t((";
  protected final String TEXT_506 = ".Internal)((";
  protected final String TEXT_507 = ")get";
  protected final String TEXT_508 = "()).featureMap()).clear(";
  protected final String TEXT_509 = "());";
  protected final String TEXT_510 = NL + "\t\t((";
  protected final String TEXT_511 = ".Internal)get";
  protected final String TEXT_512 = "()).clear(";
  protected final String TEXT_513 = "());";
  protected final String TEXT_514 = NL + "\t\t// TODO: implement this method to unset the '";
  protected final String TEXT_515 = "' ";
  protected final String TEXT_516 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_517 = NL + "\t}" + NL;
  protected final String TEXT_518 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_519 = "()" + NL + "\t{";
  protected final String TEXT_520 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_521 = ".eINSTANCE.get";
  protected final String TEXT_522 = "());";
  protected final String TEXT_523 = NL + "\t\treturn ";
  protected final String TEXT_524 = " != null && ((";
  protected final String TEXT_525 = ".Unsettable)";
  protected final String TEXT_526 = ").isSet();";
  protected final String TEXT_527 = NL + "\t\treturn ";
  protected final String TEXT_528 = "ESet;";
  protected final String TEXT_529 = NL + "\t\treturn !((";
  protected final String TEXT_530 = ".Internal)((";
  protected final String TEXT_531 = ")get";
  protected final String TEXT_532 = "()).featureMap()).isEmpty(";
  protected final String TEXT_533 = "());";
  protected final String TEXT_534 = NL + "\t\treturn !((";
  protected final String TEXT_535 = ".Internal)get";
  protected final String TEXT_536 = "()).isEmpty(";
  protected final String TEXT_537 = "());";
  protected final String TEXT_538 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_539 = "' ";
  protected final String TEXT_540 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_541 = NL + "\t}" + NL;
  protected final String TEXT_542 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_543 = " ";
  protected final String TEXT_544 = "(";
  protected final String TEXT_545 = ")";
  protected final String TEXT_546 = NL + "\t{";
  protected final String TEXT_547 = NL + "\t\t";
  protected final String TEXT_548 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\treturn true;";
  protected final String TEXT_549 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_550 = NL + "\t}" + NL;
  protected final String TEXT_551 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_552 = " eInverseAdd(";
  protected final String TEXT_553 = " otherEnd, int featureID, Class baseClass, ";
  protected final String TEXT_554 = " msgs)" + NL + "\t{" + NL + "\t\tif (featureID >= 0)" + NL + "\t\t{" + NL + "\t\t\tswitch (eDerivedStructuralFeatureID(featureID, baseClass))" + NL + "\t\t\t{";
  protected final String TEXT_555 = NL + "\t\t\t\tcase ";
  protected final String TEXT_556 = ":";
  protected final String TEXT_557 = NL + "\t\t\t\t\treturn ((";
  protected final String TEXT_558 = ")((";
  protected final String TEXT_559 = ")";
  protected final String TEXT_560 = "()).eMap()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_561 = NL + "\t\t\t\t\treturn ((";
  protected final String TEXT_562 = ")";
  protected final String TEXT_563 = "()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_564 = NL + "\t\t\t\t\tif (eContainer != null)" + NL + "\t\t\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\t\t\t\treturn eBasicSetContainer(otherEnd, ";
  protected final String TEXT_565 = ", msgs);";
  protected final String TEXT_566 = NL + "\t\t\t\t\tif (";
  protected final String TEXT_567 = " != null)";
  protected final String TEXT_568 = NL + "\t\t\t\t\t\tmsgs = ((";
  protected final String TEXT_569 = ")";
  protected final String TEXT_570 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_571 = ", null, msgs);";
  protected final String TEXT_572 = NL + "\t\t\t\t\t\tmsgs = ((";
  protected final String TEXT_573 = ")";
  protected final String TEXT_574 = ").eInverseRemove(this, ";
  protected final String TEXT_575 = ", ";
  protected final String TEXT_576 = ".class, msgs);";
  protected final String TEXT_577 = NL + "\t\t\t\t\treturn basicSet";
  protected final String TEXT_578 = "((";
  protected final String TEXT_579 = ")otherEnd, msgs);";
  protected final String TEXT_580 = NL + "\t\t\t\tdefault:" + NL + "\t\t\t\t\treturn eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\tif (eContainer != null)" + NL + "\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\treturn eBasicSetContainer(otherEnd, featureID, msgs);" + NL + "\t}" + NL;
  protected final String TEXT_581 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_582 = " eInverseRemove(";
  protected final String TEXT_583 = " otherEnd, int featureID, Class baseClass, ";
  protected final String TEXT_584 = " msgs)" + NL + "\t{" + NL + "\t\tif (featureID >= 0)" + NL + "\t\t{" + NL + "\t\t\tswitch (eDerivedStructuralFeatureID(featureID, baseClass))" + NL + "\t\t\t{";
  protected final String TEXT_585 = NL + "\t\t\t\tcase ";
  protected final String TEXT_586 = ":";
  protected final String TEXT_587 = NL + "\t\t\t\t\treturn ((";
  protected final String TEXT_588 = ")((";
  protected final String TEXT_589 = ")";
  protected final String TEXT_590 = "()).eMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_591 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_592 = ")((";
  protected final String TEXT_593 = ")";
  protected final String TEXT_594 = "()).featureMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_595 = NL + "\t\t\t\t\treturn ((";
  protected final String TEXT_596 = ")";
  protected final String TEXT_597 = "()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_598 = NL + "\t\t\t\t\treturn eBasicSetContainer(null, ";
  protected final String TEXT_599 = ", msgs);";
  protected final String TEXT_600 = NL + "\t\t\t\t\treturn basicUnset";
  protected final String TEXT_601 = "(msgs);";
  protected final String TEXT_602 = NL + "\t\t\t\t\treturn basicSet";
  protected final String TEXT_603 = "(null, msgs);";
  protected final String TEXT_604 = NL + "\t\t\t\tdefault:" + NL + "\t\t\t\t\treturn eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn eBasicSetContainer(null, featureID, msgs);" + NL + "\t}" + NL;
  protected final String TEXT_605 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_606 = " eBasicRemoveFromContainer(";
  protected final String TEXT_607 = " msgs)" + NL + "\t{" + NL + "\t\tif (eContainerFeatureID >= 0)" + NL + "\t\t{" + NL + "\t\t\tswitch (eContainerFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_608 = NL + "\t\t\t\tcase ";
  protected final String TEXT_609 = ":" + NL + "\t\t\t\t\treturn ((";
  protected final String TEXT_610 = ")eContainer).eInverseRemove(this, ";
  protected final String TEXT_611 = ", ";
  protected final String TEXT_612 = ".class, msgs);";
  protected final String TEXT_613 = NL + "\t\t\t\tdefault:" + NL + "\t\t\t\t\treturn eDynamicBasicRemoveFromContainer(msgs);" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn ((";
  protected final String TEXT_614 = ")eContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);" + NL + "\t}" + NL;
  protected final String TEXT_615 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object eGet(";
  protected final String TEXT_616 = " eFeature, boolean resolve)" + NL + "\t{" + NL + "\t\tswitch (eDerivedStructuralFeatureID(eFeature))" + NL + "\t\t{";
  protected final String TEXT_617 = NL + "\t\t\tcase ";
  protected final String TEXT_618 = ":";
  protected final String TEXT_619 = NL + "\t\t\t\treturn ";
  protected final String TEXT_620 = "() ? Boolean.TRUE : Boolean.FALSE;";
  protected final String TEXT_621 = NL + "\t\t\t\treturn new ";
  protected final String TEXT_622 = "(";
  protected final String TEXT_623 = "());";
  protected final String TEXT_624 = NL + "\t\t\t\tif (resolve) return ";
  protected final String TEXT_625 = "();" + NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_626 = "();";
  protected final String TEXT_627 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_628 = ")";
  protected final String TEXT_629 = "()).eMap();";
  protected final String TEXT_630 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_631 = ")";
  protected final String TEXT_632 = "()).featureMap();";
  protected final String TEXT_633 = NL + "\t\t\t\treturn ";
  protected final String TEXT_634 = "();";
  protected final String TEXT_635 = NL + "\t\t}" + NL + "\t\treturn eDynamicGet(eFeature, resolve);" + NL + "\t}" + NL;
  protected final String TEXT_636 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void eSet(";
  protected final String TEXT_637 = " eFeature, Object newValue)" + NL + "\t{" + NL + "\t\tswitch (eDerivedStructuralFeatureID(eFeature))" + NL + "\t\t{";
  protected final String TEXT_638 = NL + "\t\t\tcase ";
  protected final String TEXT_639 = ":";
  protected final String TEXT_640 = NL + "\t\t\t\t((";
  protected final String TEXT_641 = ")";
  protected final String TEXT_642 = "()).featureMap().clear();";
  protected final String TEXT_643 = NL + "\t\t\t\t";
  protected final String TEXT_644 = "().clear();";
  protected final String TEXT_645 = NL + "\t\t\t\t((";
  protected final String TEXT_646 = ")";
  protected final String TEXT_647 = "()).featureMap().addAll((";
  protected final String TEXT_648 = ")newValue);";
  protected final String TEXT_649 = NL + "\t\t\t\t((";
  protected final String TEXT_650 = ")";
  protected final String TEXT_651 = "()).eMap().addAll((";
  protected final String TEXT_652 = ")newValue);";
  protected final String TEXT_653 = NL + "\t\t\t\t";
  protected final String TEXT_654 = "().addAll((";
  protected final String TEXT_655 = ")newValue);";
  protected final String TEXT_656 = NL + "\t\t\t\tset";
  protected final String TEXT_657 = "(((";
  protected final String TEXT_658 = ")newValue).";
  protected final String TEXT_659 = "());";
  protected final String TEXT_660 = NL + "\t\t\t\tset";
  protected final String TEXT_661 = "((";
  protected final String TEXT_662 = ")newValue);";
  protected final String TEXT_663 = NL + "\t\t\t\treturn;";
  protected final String TEXT_664 = NL + "\t\t}" + NL + "\t\teDynamicSet(eFeature, newValue);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void eUnset(";
  protected final String TEXT_665 = " eFeature)" + NL + "\t{" + NL + "\t\tswitch (eDerivedStructuralFeatureID(eFeature))" + NL + "\t\t{";
  protected final String TEXT_666 = NL + "\t\t\tcase ";
  protected final String TEXT_667 = ":";
  protected final String TEXT_668 = NL + "\t\t\t\t((";
  protected final String TEXT_669 = ")";
  protected final String TEXT_670 = "()).featureMap().clear();";
  protected final String TEXT_671 = NL + "\t\t\t\t";
  protected final String TEXT_672 = "().clear();";
  protected final String TEXT_673 = NL + "\t\t\t\tunset";
  protected final String TEXT_674 = "();";
  protected final String TEXT_675 = NL + "\t\t\t\tset";
  protected final String TEXT_676 = "((";
  protected final String TEXT_677 = ")";
  protected final String TEXT_678 = ");";
  protected final String TEXT_679 = NL + "\t\t\t\tset";
  protected final String TEXT_680 = "((";
  protected final String TEXT_681 = ")null);";
  protected final String TEXT_682 = NL + "\t\t\t\tset";
  protected final String TEXT_683 = "(";
  protected final String TEXT_684 = "_EDEFAULT);";
  protected final String TEXT_685 = NL + "\t\t\t\treturn;";
  protected final String TEXT_686 = NL + "\t\t}" + NL + "\t\teDynamicUnset(eFeature);" + NL + "\t}" + NL;
  protected final String TEXT_687 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean eIsSet(";
  protected final String TEXT_688 = " eFeature)" + NL + "\t{" + NL + "\t\tswitch (eDerivedStructuralFeatureID(eFeature))" + NL + "\t\t{";
  protected final String TEXT_689 = NL + "\t\t\tcase ";
  protected final String TEXT_690 = ":";
  protected final String TEXT_691 = NL + "\t\t\t\treturn !((";
  protected final String TEXT_692 = ")";
  protected final String TEXT_693 = "()).featureMap().isEmpty();";
  protected final String TEXT_694 = NL + "\t\t\t\treturn ";
  protected final String TEXT_695 = " != null && !";
  protected final String TEXT_696 = ".featureMap().isEmpty();";
  protected final String TEXT_697 = NL + "\t\t\t\treturn !";
  protected final String TEXT_698 = "().isEmpty();";
  protected final String TEXT_699 = NL + "\t\t\t\treturn ";
  protected final String TEXT_700 = " != null && !";
  protected final String TEXT_701 = ".isEmpty();";
  protected final String TEXT_702 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_703 = "();";
  protected final String TEXT_704 = NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_705 = "() != null;";
  protected final String TEXT_706 = NL + "\t\t\t\treturn ";
  protected final String TEXT_707 = " != null;";
  protected final String TEXT_708 = NL + "\t\t\t\treturn ";
  protected final String TEXT_709 = "() != null;";
  protected final String TEXT_710 = NL + "\t\t\t\treturn ";
  protected final String TEXT_711 = " != null;";
  protected final String TEXT_712 = NL + "\t\t\t\treturn ";
  protected final String TEXT_713 = "() != ";
  protected final String TEXT_714 = ";";
  protected final String TEXT_715 = NL + "\t\t\t\treturn ";
  protected final String TEXT_716 = " != ";
  protected final String TEXT_717 = "_EDEFAULT;";
  protected final String TEXT_718 = NL + "\t\t\t\treturn !";
  protected final String TEXT_719 = ".equals(";
  protected final String TEXT_720 = "());";
  protected final String TEXT_721 = NL + "\t\t\t\treturn ";
  protected final String TEXT_722 = "() != null;";
  protected final String TEXT_723 = NL + "\t\t\t\treturn ";
  protected final String TEXT_724 = "_EDEFAULT == null ? ";
  protected final String TEXT_725 = " != null : !";
  protected final String TEXT_726 = "_EDEFAULT.equals(";
  protected final String TEXT_727 = ");";
  protected final String TEXT_728 = NL + "\t\t}" + NL + "\t\treturn eDynamicIsSet(eFeature);" + NL + "\t}" + NL;
  protected final String TEXT_729 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass)" + NL + "\t{";
  protected final String TEXT_730 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_731 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (derivedFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_732 = NL + "\t\t\t\tcase ";
  protected final String TEXT_733 = ": return ";
  protected final String TEXT_734 = ";";
  protected final String TEXT_735 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_736 = NL + "\t\treturn super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass)" + NL + "\t{";
  protected final String TEXT_737 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_738 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_739 = NL + "\t\t\t\tcase ";
  protected final String TEXT_740 = ": return ";
  protected final String TEXT_741 = ";";
  protected final String TEXT_742 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_743 = NL + "\t\treturn super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);" + NL + "\t}" + NL;
  protected final String TEXT_744 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic String toString()" + NL + "\t{" + NL + "\t\tif (eIsProxy()) return super.toString();" + NL + "" + NL + "\t\tStringBuffer result = new StringBuffer(super.toString());";
  protected final String TEXT_745 = NL + "\t\tresult.append(\" (";
  protected final String TEXT_746 = ": \");";
  protected final String TEXT_747 = NL + "\t\tresult.append(\", ";
  protected final String TEXT_748 = ": \");";
  protected final String TEXT_749 = NL + "\t\tif (";
  protected final String TEXT_750 = "ESet) result.append(";
  protected final String TEXT_751 = "); else result.append(\"<unset>\");";
  protected final String TEXT_752 = NL + "\t\tresult.append(";
  protected final String TEXT_753 = ");";
  protected final String TEXT_754 = NL + "\t\tresult.append(')');" + NL + "\t\treturn result.toString();" + NL + "\t}" + NL;
  protected final String TEXT_755 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected int hash = -1;" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int getHash()" + NL + "\t{" + NL + "\t\tif (hash == -1)" + NL + "\t\t{" + NL + "\t\t\tObject theKey = getKey();" + NL + "\t\t\thash = (theKey == null ? 0 : theKey.hashCode());" + NL + "\t\t}" + NL + "\t\treturn hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setHash(int hash)" + NL + "\t{" + NL + "\t\tthis.hash = hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object getKey()" + NL + "\t{";
  protected final String TEXT_756 = NL + "\t\treturn new ";
  protected final String TEXT_757 = "(getTypedKey());";
  protected final String TEXT_758 = NL + "\t\treturn getTypedKey();";
  protected final String TEXT_759 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setKey(Object key)" + NL + "\t{";
  protected final String TEXT_760 = NL + "\t\tgetTypedKey().addAll((";
  protected final String TEXT_761 = ")key);";
  protected final String TEXT_762 = NL + "\t\tsetTypedKey(((";
  protected final String TEXT_763 = ")key).";
  protected final String TEXT_764 = "());";
  protected final String TEXT_765 = NL + "\t\tsetTypedKey((";
  protected final String TEXT_766 = ")key);";
  protected final String TEXT_767 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object getValue()" + NL + "\t{";
  protected final String TEXT_768 = NL + "\t\treturn new ";
  protected final String TEXT_769 = "(getTypedValue());";
  protected final String TEXT_770 = NL + "\t\treturn getTypedValue();";
  protected final String TEXT_771 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object setValue(Object value)" + NL + "\t{" + NL + "\t\tObject oldValue = getValue();";
  protected final String TEXT_772 = NL + "\t\tgetTypedValue().clear();" + NL + "\t\tgetTypedValue().addAll((";
  protected final String TEXT_773 = ")value);";
  protected final String TEXT_774 = NL + "\t\tsetTypedValue(((";
  protected final String TEXT_775 = ")value).";
  protected final String TEXT_776 = "());";
  protected final String TEXT_777 = NL + "\t\tsetTypedValue((";
  protected final String TEXT_778 = ")value);";
  protected final String TEXT_779 = NL + "\t\treturn oldValue;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_780 = " getEMap()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_781 = " container = eContainer();" + NL + "\t\treturn container == null ? null : (";
  protected final String TEXT_782 = ")container.eGet(eContainmentFeature());" + NL + "\t}" + NL;
  protected final String TEXT_783 = NL + "} //";
  protected final String TEXT_784 = NL;

  public String generate(Object argument)
  {
    StringBuffer stringBuffer = new StringBuffer();
    
/**
 * <copyright>
 *
 * Copyright (c) 2002-2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * </copyright>
 */

    GenClass genClass = (GenClass)argument; GenPackage genPackage = genClass.getGenPackage(); GenModel genModel=genPackage.getGenModel();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    stringBuffer.append("$");
    stringBuffer.append(TEXT_3);
    stringBuffer.append("$");
    stringBuffer.append(TEXT_4);
    stringBuffer.append(genPackage.getClassPackageName());
    stringBuffer.append(TEXT_5);
    genModel.markImportLocation(stringBuffer);
    stringBuffer.append(TEXT_6);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_7);
    if (!genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_8);
    for (Iterator i=genClass.getImplementedGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_9);
    stringBuffer.append(genClass.getQualifiedClassName());
    stringBuffer.append(TEXT_10);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_11);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_12);
    }
    stringBuffer.append(TEXT_13);
    }
    stringBuffer.append(TEXT_14);
    if (genClass.isAbstract()) {
    stringBuffer.append(TEXT_15);
    }
    stringBuffer.append(TEXT_16);
    stringBuffer.append(genClass.getClassName());
    stringBuffer.append(genClass.getClassExtends());
    stringBuffer.append(genClass.getClassImplements());
    stringBuffer.append(TEXT_17);
    if (genModel.getCopyrightText() != null) {
    stringBuffer.append(TEXT_18);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_19);
    stringBuffer.append(genModel.getCopyrightText());
    stringBuffer.append(TEXT_20);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_21);
    }
    if (genModel.getDriverNumber() != null) {
    stringBuffer.append(TEXT_22);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_23);
    stringBuffer.append(genModel.getDriverNumber());
    stringBuffer.append(TEXT_24);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_25);
    }
    if (!genModel.isReflectiveDelegation()) {
    for (Iterator i=genClass.getImplementedGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    if (!genFeature.isVolatile() && !genFeature.isContainer()) {
    if (genFeature.isListType() || genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_26);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_27);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_28);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_29);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_30);
    stringBuffer.append(genFeature.getImportedInternalType());
    stringBuffer.append(TEXT_31);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_32);
    } else {
    stringBuffer.append(TEXT_33);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_35);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_36);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_37);
    if (genFeature.getStaticDefaultValue() != null) {
    stringBuffer.append(TEXT_38);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_39);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_40);
    stringBuffer.append(genFeature.getStaticDefaultValue());
    stringBuffer.append(TEXT_41);
    stringBuffer.append(genModel.getNonNLS(genFeature.getStaticDefaultValue()));
    } else { GenDataType genDataType = genFeature.getGenDataTypeType(); GenPackage typeGenPackage = genFeature.getTypeGenPackage();
    if (genDataType != null && typeGenPackage != null) {
    stringBuffer.append(TEXT_42);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_43);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_44);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_45);
    }
    stringBuffer.append(TEXT_46);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_47);
    stringBuffer.append(typeGenPackage.getImportedFactoryInterfaceName());
    stringBuffer.append(TEXT_48);
    stringBuffer.append(typeGenPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_49);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_50);
    stringBuffer.append(genFeature.getDefaultValue());
    stringBuffer.append(TEXT_51);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_52);
    stringBuffer.append(genFeature.getType());
    stringBuffer.append(TEXT_53);
    }
    stringBuffer.append(TEXT_54);
    stringBuffer.append(genModel.getNonNLS(genFeature.getDefaultValue()));
    } else {
    stringBuffer.append(TEXT_55);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_56);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_57);
    }
    }
    stringBuffer.append(TEXT_58);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_60);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_61);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_62);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_64);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_65);
    }
    if (!genFeature.isListType() && genFeature.isUnsettable() && genFeature.isChangeable()) {
    stringBuffer.append(TEXT_66);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_67);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_68);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_69);
    }
    }
    }
    }
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genClass.getClassName());
    stringBuffer.append(TEXT_71);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_72);
    stringBuffer.append(genPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_73);
    stringBuffer.append(genClass.getClassifierAccessorName());
    stringBuffer.append(TEXT_74);
    for (Iterator i=genClass.getImplementedGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_77);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_78);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_79);
    }
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_81);
    stringBuffer.append(genFeature.getGenPackage().getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_82);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_83);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_84);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_85);
    }
    stringBuffer.append(TEXT_86);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) { String unsettable = genFeature.isUnsettable() ? ".Unsettable" : ""; 
    stringBuffer.append(TEXT_87);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_88);
    if (genFeature.isMapType()) { GenClass mapGenClass = genFeature.getMapGenClass(); GenPackage mapGenPackage = mapGenClass.getGenPackage(); 
    stringBuffer.append(TEXT_89);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_90);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreEMap"));
    stringBuffer.append(TEXT_91);
    stringBuffer.append(mapGenPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_92);
    stringBuffer.append(mapGenClass.getName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genFeature.getMapItemType());
    stringBuffer.append(TEXT_94);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_95);
    } else if (genFeature.isContains()) {
    if (genFeature.isBidirectional()) { GenFeature reverseFeature = genFeature.getReverse();
    stringBuffer.append(TEXT_96);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList"));
    stringBuffer.append(unsettable);
    stringBuffer.append(TEXT_98);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_100);
    stringBuffer.append(reverseFeature.getGenClass().getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_101);
    } else {
    stringBuffer.append(TEXT_102);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_103);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EObjectContainmentEList"));
    stringBuffer.append(unsettable);
    stringBuffer.append(TEXT_104);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_105);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_106);
    }
    } else if (genFeature.isReferenceType()) {
    if (genFeature.isBidirectional()) { GenFeature reverseFeature = genFeature.getReverse();
    if (reverseFeature.isListType()) {
    if (genFeature.isResolveProxies()) {
    stringBuffer.append(TEXT_107);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_108);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList"));
    stringBuffer.append(unsettable);
    stringBuffer.append(TEXT_109);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_110);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_111);
    stringBuffer.append(reverseFeature.getGenClass().getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_112);
    } else {
    stringBuffer.append(TEXT_113);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_114);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EObjectWithInverseEList"));
    stringBuffer.append(unsettable);
    stringBuffer.append(TEXT_115);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_116);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_117);
    stringBuffer.append(reverseFeature.getGenClass().getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_118);
    }
    } else {
    if (genFeature.isResolveProxies()) {
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_120);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList"));
    stringBuffer.append(unsettable);
    stringBuffer.append(TEXT_121);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_122);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_123);
    stringBuffer.append(reverseFeature.getGenClass().getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_124);
    } else {
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_126);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EObjectWithInverseEList"));
    stringBuffer.append(unsettable);
    stringBuffer.append(TEXT_127);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_128);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_129);
    stringBuffer.append(reverseFeature.getGenClass().getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_130);
    }
    }
    } else {
    if (genFeature.isResolveProxies()) {
    stringBuffer.append(TEXT_131);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_132);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EObjectResolvingEList"));
    stringBuffer.append(unsettable);
    stringBuffer.append(TEXT_133);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_134);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_135);
    } else {
    stringBuffer.append(TEXT_136);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_137);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EObjectEList"));
    stringBuffer.append(unsettable);
    stringBuffer.append(TEXT_138);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_139);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_140);
    }
    }
    } else if (genFeature.isFeatureMapType()) {
    if (genFeature.isFeatureMapWrapped()) {
    stringBuffer.append(TEXT_141);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_142);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperClass());
    stringBuffer.append(TEXT_143);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.BasicFeatureMap"));
    stringBuffer.append(TEXT_144);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_145);
    } else {
    stringBuffer.append(TEXT_146);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_147);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.BasicFeatureMap"));
    stringBuffer.append(TEXT_148);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_149);
    }
    } else {//datatype
    if (genFeature.isUnique()) {
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EDataTypeUniqueEList"));
    stringBuffer.append(unsettable);
    stringBuffer.append(TEXT_152);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_153);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_154);
    } else {
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_156);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EDataTypeEList"));
    stringBuffer.append(unsettable);
    stringBuffer.append(TEXT_157);
    stringBuffer.append(genFeature.getListItemType());
    stringBuffer.append(TEXT_158);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_159);
    }
    }
    stringBuffer.append(TEXT_160);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes() ? ".map()" : "");
    stringBuffer.append(TEXT_161);
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_162);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_163);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_164);
    } else {
    if (genFeature.isResolveProxies()) {
    stringBuffer.append(TEXT_165);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_166);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_167);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_168);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_169);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_170);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_171);
    stringBuffer.append(genFeature.getImportedInternalType());
    stringBuffer.append(TEXT_172);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_173);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_174);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_175);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_176);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_177);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_178);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_179);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_180);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_181);
    }
    stringBuffer.append(TEXT_182);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_183);
    }
    } else {//volatile
    if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_184);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_185);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_186);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_187);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_188);
    stringBuffer.append(genFeature.getImportedInternalType());
    stringBuffer.append(TEXT_189);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_190);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_191);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (genFeature.isFeatureMapType()) {
    if (delegateFeature.isFeatureMapWrapped()) {
    stringBuffer.append(TEXT_192);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperClass());
    stringBuffer.append(TEXT_193);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap$Internal"));
    stringBuffer.append(TEXT_194);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_195);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_196);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_197);
    } else {
    stringBuffer.append(TEXT_198);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_200);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_201);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_202);
    }
    } else if (genFeature.isListType()) {
    if (delegateFeature.isFeatureMapWrapped()) {
    stringBuffer.append(TEXT_203);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_204);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_205);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_206);
    } else {
    stringBuffer.append(TEXT_207);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_208);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_209);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_210);
    }
    } else {
    if (delegateFeature.isFeatureMapWrapped()) {
    stringBuffer.append(TEXT_211);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_212);
    }
    stringBuffer.append(TEXT_213);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_214);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_215);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_216);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_217);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_218);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_219);
    }
    stringBuffer.append(TEXT_220);
    } else {
    stringBuffer.append(TEXT_221);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_222);
    }
    stringBuffer.append(TEXT_223);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_224);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_225);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_226);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_227);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_228);
    }
    stringBuffer.append(TEXT_229);
    }
    }
    } else {
    stringBuffer.append(TEXT_230);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_231);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_232);
    }
    }
    stringBuffer.append(TEXT_233);
    if (!genModel.isReflectiveDelegation() && genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_234);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_235);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_236);
    if (!genFeature.isVolatile()) {
    stringBuffer.append(TEXT_237);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_238);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isFeatureMapWrapped()) {
    stringBuffer.append(TEXT_239);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_240);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_241);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_242);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_243);
    } else {
    stringBuffer.append(TEXT_244);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_245);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_246);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_247);
    }
    } else {
    stringBuffer.append(TEXT_248);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_249);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_250);
    }
    stringBuffer.append(TEXT_251);
    }
    if (!genFeature.isListType()) {
    if (!genModel.isReflectiveDelegation() && (genFeature.isBidirectional() && !genFeature.isContainer() && !genFeature.isVolatile() || genFeature.isContains())) {
    stringBuffer.append(TEXT_252);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_253);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_254);
    stringBuffer.append(genFeature.getImportedInternalType());
    stringBuffer.append(TEXT_255);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_256);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_257);
    if (!genFeature.isVolatile()) {
    stringBuffer.append(TEXT_258);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_259);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_260);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_261);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_262);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_263);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_264);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_266);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_267);
    }
    stringBuffer.append(TEXT_268);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_269);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_270);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_271);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_272);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_273);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_274);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_275);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_276);
    } else {
    stringBuffer.append(TEXT_277);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_278);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_279);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_280);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_281);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_282);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_283);
    }
    stringBuffer.append(TEXT_284);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isFeatureMapWrapped()) {
    stringBuffer.append(TEXT_285);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_286);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_287);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_288);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_289);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_290);
    } else {
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_292);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_293);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_294);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_295);
    }
    } else {
    stringBuffer.append(TEXT_296);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_297);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_298);
    }
    stringBuffer.append(TEXT_299);
    }
    if (genFeature.isChangeable()) {
    stringBuffer.append(TEXT_300);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_301);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_302);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_303);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_304);
    stringBuffer.append(genFeature.getGenPackage().getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_305);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_306);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_307);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_308);
    }
    stringBuffer.append(TEXT_309);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_310);
    }
    stringBuffer.append(TEXT_311);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isContainer()) { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_312);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_313);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_314);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_315);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_316);
    stringBuffer.append(genFeature.getEObjectCast());
    stringBuffer.append(TEXT_317);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_318);
    stringBuffer.append(genModel.getImportedName("java.lang.IllegalArgumentException"));
    stringBuffer.append(TEXT_319);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_320);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_321);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_322);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_323);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_324);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_325);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_326);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_327);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_328);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_329);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_330);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_331);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_332);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_333);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_334);
    } else if (genFeature.isBidirectional() || genFeature.isContains()) {
    stringBuffer.append(TEXT_335);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_336);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_337);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_338);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_339);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_340);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_341);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_342);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_343);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_344);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_345);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_346);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_347);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_348);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_349);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_350);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_351);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_352);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_353);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_354);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_355);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_356);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_357);
    }
    stringBuffer.append(TEXT_358);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_359);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_360);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_361);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_362);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_363);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_364);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_365);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_366);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_367);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_368);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_369);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_370);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_371);
    } else {
    stringBuffer.append(TEXT_372);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_373);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_374);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_375);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_376);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_377);
    }
    } else {
    stringBuffer.append(TEXT_378);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_379);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_380);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_381);
    if (genFeature.isEnumType()) {
    stringBuffer.append(TEXT_382);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_383);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_384);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_385);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_386);
    } else {
    stringBuffer.append(TEXT_387);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_388);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_389);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_390);
    }
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_391);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_392);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_393);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_394);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_395);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_396);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_397);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_398);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_399);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_400);
    } else {
    stringBuffer.append(TEXT_401);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_402);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_403);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_404);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_405);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_406);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isFeatureMapWrapped()) {
    stringBuffer.append(TEXT_407);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_408);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_409);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_410);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_411);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_412);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_413);
    }
    stringBuffer.append(TEXT_414);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_415);
    }
    stringBuffer.append(TEXT_416);
    } else {
    stringBuffer.append(TEXT_417);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_418);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_419);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_420);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_421);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_422);
    }
    stringBuffer.append(TEXT_423);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_424);
    }
    stringBuffer.append(TEXT_425);
    }
    } else {
    stringBuffer.append(TEXT_426);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_427);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_428);
    }
    stringBuffer.append(TEXT_429);
    }//if (genFeature.isChangeable())
    }//if (!genFeature.isListType())
    if (genFeature.isUnsettable()) {
    if (genFeature.isChangeable()) {
    if (!genFeature.isListType() && genFeature.isReferenceType() && (genFeature.isBidirectional() || genFeature.isContains())) {
    stringBuffer.append(TEXT_430);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_431);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_432);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_433);
    if (!genFeature.isVolatile()) {
    stringBuffer.append(TEXT_434);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_435);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_436);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_437);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_438);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_439);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_440);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_441);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_442);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_443);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_444);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_445);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_446);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_447);
    } else {
    stringBuffer.append(TEXT_448);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_449);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_450);
    }
    stringBuffer.append(TEXT_451);
    }
    stringBuffer.append(TEXT_452);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_453);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_454);
    stringBuffer.append(genFeature.getGenPackage().getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_455);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_456);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_457);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_458);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_459);
    } else if (genFeature.isBidirectional() || genFeature.isContains()) {
    stringBuffer.append(TEXT_460);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_461);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_462);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_463);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_464);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_465);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_466);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_467);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_468);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_469);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_470);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_471);
    }
    stringBuffer.append(TEXT_472);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_473);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_474);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_475);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_476);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_477);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_478);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_479);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_480);
    } else {
    stringBuffer.append(TEXT_481);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_482);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_483);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_484);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_485);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_486);
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_487);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_488);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_489);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_490);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_491);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_492);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_493);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_494);
    } else {
    stringBuffer.append(TEXT_495);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_496);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_497);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_498);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_499);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_500);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_501);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_502);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_503);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_504);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isFeatureMapWrapped()) {
    stringBuffer.append(TEXT_505);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_506);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_507);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_508);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_509);
    } else {
    stringBuffer.append(TEXT_510);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_511);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_512);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_513);
    }
    } else {
    stringBuffer.append(TEXT_514);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_515);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_516);
    }
    stringBuffer.append(TEXT_517);
    }//if (genFeature.isChangeable())
    stringBuffer.append(TEXT_518);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_519);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_520);
    stringBuffer.append(genFeature.getGenPackage().getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_521);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_522);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_523);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_524);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_525);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_526);
    } else {
    stringBuffer.append(TEXT_527);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_528);
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isFeatureMapWrapped()) {
    stringBuffer.append(TEXT_529);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_530);
    stringBuffer.append(delegateFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_531);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_532);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_533);
    } else {
    stringBuffer.append(TEXT_534);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_535);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_536);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_537);
    }
    } else {
    stringBuffer.append(TEXT_538);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_539);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_540);
    }
    stringBuffer.append(TEXT_541);
    }
    }//for
    for (Iterator i=genClass.getImplementedGenOperations().iterator(); i.hasNext();) { GenOperation genOperation = (GenOperation)i.next();
    stringBuffer.append(TEXT_542);
    stringBuffer.append(genOperation.getImportedReturnType());
    stringBuffer.append(TEXT_543);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_544);
    stringBuffer.append(genOperation.getParameters());
    stringBuffer.append(TEXT_545);
    stringBuffer.append(genOperation.getThrows());
    stringBuffer.append(TEXT_546);
    if (genOperation.hasBody()) {
    stringBuffer.append(TEXT_547);
    stringBuffer.append(genOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else if (genOperation.isInvariant()) {
    stringBuffer.append(TEXT_548);
    } else {
    stringBuffer.append(TEXT_549);
    }
    stringBuffer.append(TEXT_550);
    }//for
    if (!genModel.isReflectiveDelegation() && !genClass.getEInverseAddGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_551);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_552);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_553);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_554);
    for (Iterator i=genClass.getEInverseAddGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_555);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_556);
    if (genFeature.isListType()) {
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_557);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_558);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap$InternalMapView"));
    stringBuffer.append(TEXT_559);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_560);
    } else {
    stringBuffer.append(TEXT_561);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_562);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_563);
    }
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_564);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_565);
    } else {
    stringBuffer.append(TEXT_566);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_567);
    if (genFeature.isContains()) {
    stringBuffer.append(TEXT_568);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_569);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_570);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_571);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_572);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_573);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_574);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_575);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_576);
    }
    stringBuffer.append(TEXT_577);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_578);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_579);
    }
    }
    stringBuffer.append(TEXT_580);
    }
    if (!genModel.isReflectiveDelegation() && !genClass.getEInverseRemoveGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_581);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_582);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_583);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_584);
    for (Iterator i=genClass.getEInverseRemoveGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_585);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_586);
    if (genFeature.isListType()) {
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_587);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_588);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap$InternalMapView"));
    stringBuffer.append(TEXT_589);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_590);
    } else if (genFeature.isFeatureMapWrapped()) {
    stringBuffer.append(TEXT_591);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_592);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_593);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_594);
    } else {
    stringBuffer.append(TEXT_595);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_596);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_597);
    }
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_598);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_599);
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_600);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_601);
    } else {
    stringBuffer.append(TEXT_602);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_603);
    }
    }
    stringBuffer.append(TEXT_604);
    }
    if (!genModel.isReflectiveDelegation() && !genClass.getEBasicRemoveFromContainerGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_605);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_606);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_607);
    for (Iterator i=genClass.getEBasicRemoveFromContainerGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass();
    stringBuffer.append(TEXT_608);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_609);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_610);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_611);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_612);
    }
    stringBuffer.append(TEXT_613);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_614);
    }
    if (!genModel.isReflectiveDelegation() && !genClass.getAllGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_615);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_616);
    for (Iterator i=genClass.getAllGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_617);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_618);
    if (genFeature.isPrimitiveType() && !genFeature.isListType()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_619);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_620);
    } else {
    stringBuffer.append(TEXT_621);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_622);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_623);
    }
    } else if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_624);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_625);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_626);
    } else if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_627);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap$InternalMapView"));
    stringBuffer.append(TEXT_628);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_629);
    } else if (genFeature.isFeatureMapWrapped()) {
    stringBuffer.append(TEXT_630);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_631);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_632);
    } else {
    stringBuffer.append(TEXT_633);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_634);
    }
    }
    stringBuffer.append(TEXT_635);
    }
    if (!genModel.isReflectiveDelegation() && !genClass.getESetGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_636);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_637);
    for (Iterator i=genClass.getESetGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_638);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_639);
    if (genFeature.isListType()) {
    if (genFeature.isFeatureMapWrapped()) {
    stringBuffer.append(TEXT_640);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_641);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_642);
    } else {
    stringBuffer.append(TEXT_643);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_644);
    }
    if (genFeature.isFeatureMapWrapped()) {
    stringBuffer.append(TEXT_645);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_646);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_647);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_648);
    } else if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_649);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap$InternalMapView"));
    stringBuffer.append(TEXT_650);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_651);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_652);
    } else {
    stringBuffer.append(TEXT_653);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_654);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_655);
    }
    } else if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_656);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_657);
    stringBuffer.append(genFeature.getObjectType());
    stringBuffer.append(TEXT_658);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_659);
    } else {
    stringBuffer.append(TEXT_660);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_661);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_662);
    }
    stringBuffer.append(TEXT_663);
    }
    stringBuffer.append(TEXT_664);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_665);
    for (Iterator i=genClass.getESetGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_666);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_667);
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isFeatureMapWrapped()) {
    stringBuffer.append(TEXT_668);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_669);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_670);
    } else {
    stringBuffer.append(TEXT_671);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_672);
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_673);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_674);
    } else if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_675);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_676);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_677);
    stringBuffer.append(genFeature.getStaticDefaultValue());
    stringBuffer.append(TEXT_678);
    stringBuffer.append(genModel.getNonNLS(genFeature.getStaticDefaultValue()));
    } else if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_679);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_680);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_681);
    } else {
    stringBuffer.append(TEXT_682);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_683);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_684);
    }
    stringBuffer.append(TEXT_685);
    }
    stringBuffer.append(TEXT_686);
    }
    if (!genModel.isReflectiveDelegation() && !genClass.getAllGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_687);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_688);
    for (Iterator i=genClass.getAllGenFeatures().iterator(); i.hasNext();) { GenFeature genFeature = (GenFeature)i.next();
    stringBuffer.append(TEXT_689);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_690);
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isFeatureMapWrapped()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_691);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_692);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_693);
    } else {
    stringBuffer.append(TEXT_694);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_695);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_696);
    }
    } else {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_697);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_698);
    } else {
    stringBuffer.append(TEXT_699);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_700);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_701);
    }
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_702);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_703);
    } else if (genFeature.isResolveProxies()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_704);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_705);
    } else {
    stringBuffer.append(TEXT_706);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_707);
    }
    } else if (genFeature.isReferenceType()) {
    if (genFeature.isVolatile() || genFeature.isContainer()) {
    stringBuffer.append(TEXT_708);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_709);
    } else {
    stringBuffer.append(TEXT_710);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_711);
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_712);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_713);
    stringBuffer.append(genFeature.getStaticDefaultValue());
    stringBuffer.append(TEXT_714);
    stringBuffer.append(genModel.getNonNLS(genFeature.getStaticDefaultValue()));
    } else {
    stringBuffer.append(TEXT_715);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_716);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_717);
    }
    } else {//datatype
    if (genFeature.isVolatile()) {
    if (genFeature.isSetDefaultValue()) {
    stringBuffer.append(TEXT_718);
    stringBuffer.append(genFeature.getStaticDefaultValue());
    stringBuffer.append(TEXT_719);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_720);
    stringBuffer.append(genModel.getNonNLS(genFeature.getStaticDefaultValue()));
    } else {
    stringBuffer.append(TEXT_721);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_722);
    }
    } else {
    stringBuffer.append(TEXT_723);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_724);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_725);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_726);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_727);
    }
    }
    }
    stringBuffer.append(TEXT_728);
    }
    if (!genClass.getMixinGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_729);
    for (Iterator m=genClass.getMixinGenClasses().iterator(); m.hasNext();) { GenClass mixinGenClass = (GenClass)m.next(); 
    stringBuffer.append(TEXT_730);
    stringBuffer.append(mixinGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_731);
    for (Iterator f=mixinGenClass.getGenFeatures().iterator(); f.hasNext();) { GenFeature genFeature = (GenFeature)f.next(); 
    stringBuffer.append(TEXT_732);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_733);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_734);
    }
    stringBuffer.append(TEXT_735);
    }
    stringBuffer.append(TEXT_736);
    for (Iterator m=genClass.getMixinGenClasses().iterator(); m.hasNext();) { GenClass mixinGenClass = (GenClass)m.next(); 
    stringBuffer.append(TEXT_737);
    stringBuffer.append(mixinGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_738);
    for (Iterator f=mixinGenClass.getGenFeatures().iterator(); f.hasNext();) { GenFeature genFeature = (GenFeature)f.next(); 
    stringBuffer.append(TEXT_739);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_740);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_741);
    }
    stringBuffer.append(TEXT_742);
    }
    stringBuffer.append(TEXT_743);
    }
    if (!genModel.isReflectiveDelegation() && !genClass.getToStringGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_744);
    { boolean first = true;
    for (Iterator i=genClass.getToStringGenFeatures().iterator(); i.hasNext(); ) { GenFeature genFeature = (GenFeature)i.next();
    if (first) { first = false;
    stringBuffer.append(TEXT_745);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_746);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_747);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_748);
    stringBuffer.append(genModel.getNonNLS());
    }
    if (genFeature.isUnsettable() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_749);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_750);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_751);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_752);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_753);
    }
    }
    }
    stringBuffer.append(TEXT_754);
    }
    if (genClass.isMapEntry()) { GenFeature keyFeature = genClass.getMapEntryKeyFeature(); GenFeature valueFeature = genClass.getMapEntryValueFeature();
    stringBuffer.append(TEXT_755);
    if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_756);
    stringBuffer.append(keyFeature.getObjectType());
    stringBuffer.append(TEXT_757);
    } else {
    stringBuffer.append(TEXT_758);
    }
    stringBuffer.append(TEXT_759);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_760);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_761);
    } else if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_762);
    stringBuffer.append(keyFeature.getObjectType());
    stringBuffer.append(TEXT_763);
    stringBuffer.append(keyFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_764);
    } else {
    stringBuffer.append(TEXT_765);
    stringBuffer.append(keyFeature.getImportedType());
    stringBuffer.append(TEXT_766);
    }
    stringBuffer.append(TEXT_767);
    if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_768);
    stringBuffer.append(valueFeature.getObjectType());
    stringBuffer.append(TEXT_769);
    } else {
    stringBuffer.append(TEXT_770);
    }
    stringBuffer.append(TEXT_771);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_772);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_773);
    } else if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_774);
    stringBuffer.append(valueFeature.getObjectType());
    stringBuffer.append(TEXT_775);
    stringBuffer.append(valueFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_776);
    } else {
    stringBuffer.append(TEXT_777);
    stringBuffer.append(valueFeature.getImportedType());
    stringBuffer.append(TEXT_778);
    }
    stringBuffer.append(TEXT_779);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_780);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_781);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_782);
    }
    stringBuffer.append(TEXT_783);
    stringBuffer.append(genClass.getClassName());
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_784);
    return stringBuffer.toString();
  }
}
