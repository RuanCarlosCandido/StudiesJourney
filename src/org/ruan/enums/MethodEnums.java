package org.ruan.enums;

public enum MethodEnums implements Util {

	My_AGE(12) {
		public boolean isPair() {
			int a = Integer.parseInt(My_AGE.getO().toString());
			return a % 2 == 0;
		}
	};

	Object O;

	public Object getO() {
		return O;
	}

	private MethodEnums(Object o) {
		O = o;
	}

	@Override
	public boolean isPair() {
		// TODO Auto-generated method stub
		return false;
	}

}
