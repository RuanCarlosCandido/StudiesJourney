package org.ruan.markdown;

public class Comments {

	public static void main(String[] args) {

		method();
		method2();
		
	}

	/**
	 * texto normal e isso {@code e um codigo}
	 *
	 * <p>isso e um paragrafo</p>
	 * 
	 * <p><b>isso e outro paragrafo em negrito</b></p>
	 *
	 *{@link isso.e.um.link}
	 *
	 *<ul>
	 *<li>1 - Lista valor 1</li>
	 *<li>2 - Lista valor 2</li>
	 *<li>3 - Lista valor 3</li>
	 *</ul>
	 *
	 *@return isso e o que retorna.
	 *
	 *@Ruan
	 *
	 *@see aqui.faz.referencia.a.outro.comentario
	 *
	 */
	public static void method() {
		
	}

	
	/**
	 * <blockquote>
	 * <pre>
	 * isso e um blockquote
	 *</pre>
	 * </blockquote>
	 * 
	 * @throws isso e um throw
	 * @param isso e um parametro
	 * 
	 */
	public static void method2() {
		
	}
	
}
