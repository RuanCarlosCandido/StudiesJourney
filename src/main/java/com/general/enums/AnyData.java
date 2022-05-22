package com.general.enums;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public enum AnyData implements Master {

	A(45), B("UI"), C(false), D('t'), E("P"), F("Lorem IPSUM"), G(99.99), H(new BigDecimal(200.40)),
	I(new int[] { 10, 20, 30 }), J(new Double(3.5)), K(9.0f), L(20l), M(D), N(new Integer(46)), P(Integer.MIN_VALUE),
	Q(new Short((short) 2)), R(new Byte((byte) 50)), S(new Boolean(false));

	Object O;
	static Map<AnyData, Object> map = new HashMap<AnyData, Object>();

	static {

	}

	private AnyData(Object o) {
		O = o;
	}

	public void print() {
		System.out.println(this + " " + O);
	}

	public Object getO() {
		return O;
	}

	@Override
	public String asString() {
		return getO().toString();
	}

	@Override
	public Double asDouble() {
		try {
			return Double.parseDouble(O.toString());
		} catch (NumberFormatException e) {
			System.err.println("ALERT: " + e);
			return null;
		}
	}

	@Override
	public Integer asInteger() {
		try {
			return Integer.parseInt(O.toString());
		} catch (NumberFormatException e) {
			try {
				return asDouble().intValue();
			} catch (Exception e1) {
				System.err.println("ALERT: " + e1);
				return null;
			}
		}
	}

	@Override
	public BigDecimal asBigDecimal() {

		try {
			return BigDecimal.valueOf(asDouble());
		} catch (NumberFormatException e) {
			System.err.println("ALERT: " + e);
			return null;
		}

	}

	@Override
	public Character asCharacter() {
		return null;
	}

}
