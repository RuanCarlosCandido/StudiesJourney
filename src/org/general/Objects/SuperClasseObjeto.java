package org.general.Objects;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class SuperClasseObjeto {

	public static void main(String[] args) {
		Object objeto = createObjeto();
		
		deserializarViaObject(objeto);
	}

	private static Object deserializarViaObject(Object objeto) {

		Class<? extends Object> classe = objeto.getClass();
		System.out.println(classe);

		AnnotatedType[] annotatedTypes = classe.getAnnotatedInterfaces();
		for (int i = 0; i < annotatedTypes.length; i++) {
			System.out.println("annotated Types array " + annotatedTypes[i].toString());
		}

		AnnotatedType annotatedType = classe.getAnnotatedSuperclass();
		System.out.println("annotated Type object " + annotatedType.toString());

		Annotation[] annotations = classe.getAnnotations();
		for (int i = 0; i < annotations.length; i++) {
			System.out.println("annotations " + annotations[i].toString());
		}

		String canonicalName = classe.getCanonicalName();
		System.out.println("canonical name" + canonicalName);

		int modifiers = classe.getModifiers();
		System.out.println("modifiers" + modifiers);

		ClassLoader classLoader = classe.getClassLoader();
		System.out.println("classLoader" + classLoader);

		Class<?> componentType = classe.getComponentType();
		System.out.println("component type" + componentType);

		Constructor<?>[] constructors = classe.getConstructors();
		for (int i = 0; i < constructors.length; i++) {
			System.out.println("constructors " + constructors[i].toString());
		}

		Annotation[] DeclaredannotationArray;
		DeclaredannotationArray = classe.getDeclaredAnnotations();
		for (int i = 0; i < DeclaredannotationArray.length; i++) {
			System.out.println("annotation" + DeclaredannotationArray[i].toString());
		}

		Class<?>[] declaredClasses = classe.getDeclaredClasses();

		for (int i = 0; i < declaredClasses.length; i++) {
			System.out.println("declared classes: " + declaredClasses[i].toString());
		}

		Constructor<?>[] declaredConstructors = classe.getDeclaredConstructors();

		for (int i = 0; i < declaredConstructors.length; i++) {
			System.out.println("declaredConstructors " + declaredConstructors[i]);
		}

		Field[] declaredFields = classe.getDeclaredFields();

		for (int i = 0; i < declaredFields.length; i++) {
			System.out.println("declaredFields " + declaredFields[i]);
		}

		Method[] method = classe.getDeclaredMethods();

		for (int i = 0; i < method.length; i++) {
			System.out.println("method " + method[i]);
		}

		Class<?> class1 = classe.getDeclaringClass();
		System.out.println("declaringClass" + class1);

		Class<?> class2 = classe.getEnclosingClass();
		System.out.println("enclosingClass" + class2);

		Constructor<?> constructor = classe.getEnclosingConstructor();
		System.out.println("constructor" + constructor);

		Method method1 = classe.getEnclosingMethod();
		System.out.println("method" + method1);

		Field[] fields = classe.getFields();

		for (int j = 0; j < fields.length; j++) {
			System.out.println("fields " + fields[j]);
		}

		Type[] genericInterfaces = classe.getGenericInterfaces();

		for (int i = 0; i < genericInterfaces.length; i++) {
			System.out.println("genericInterfaces " + genericInterfaces[i]);
		}

		Method[] methods = classe.getMethods();

		for (int j = 0; j < methods.length; j++) {
			System.out.println("methods " + methods[j]);
		}

		String classeName = classe.getName();

		System.out.println("classeName" + classeName);

		Package package1 = classe.getPackage();

		System.out.println("package" + package1);

		ProtectionDomain protectionDomain = classe.getProtectionDomain();
		System.out.println("protectionDomain" + protectionDomain);

		String simpleName = classe.getSimpleName();

		System.out.println("simpleName " + simpleName);

		Class<?> superClass = classe.getSuperclass();
		System.out.println("superClass" + superClass);

		String typeName = classe.getTypeName();

		System.out.println("typeName " + typeName);

		TypeVariable<?>[] typeVariable = classe.getTypeParameters();

		for (int i = 0; i < typeVariable.length; i++) {
			System.out.println("typeVariable " + typeVariable[i]);
		}

		HashMap<?, ?> hashMap = (HashMap<?, ?>) objeto;

		LinkedHashSet<?> set = (LinkedHashSet<?>) hashMap.get("set");
		ArrayList<?> list = (ArrayList<?>) hashMap.get("list");
		HashMap<?, ?> hashmap = (HashMap<?, ?>) hashMap.get("hashmap");
		// deserializacao correta

		System.out.println(set.getClass().getSimpleName());
		System.out.println(list.getClass().getSimpleName());
		System.out.println(hashmap.getClass().getSimpleName());

		return null;

	}

	private static Object createObjeto() {

		Set<Object> set = new LinkedHashSet<Object>();

		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);

		System.out.println(set);

		List<Object> list = new ArrayList<Object>();
		list.add('a');
		list.add('b');
		list.add('c');
		list.add('d');

		System.out.println(list);

		HashMap<Object, Object> map = new HashMap<Object, Object>();
		map.put(0, "a");
		map.put(1, "a");
		map.put(2, "a");
		map.put(3, "a");

		HashMap<Object, Object> geral = new HashMap<Object, Object>();
		geral.put("hashmap", map);
		geral.put("list", list);
		geral.put("set", set);

		Object objeto = geral;

		return objeto;
	}

}
