package reflections;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import reflections.rabbit.RabbitAnnotation;

public class ReflectionChecker {
	public void showClassName(Object object) {
		Class clazz = object.getClass();
		System.out.println(clazz.getName());
	}

	public void showClassFields(Object object) {

		System.out.println("\nshowClassFields:");

		Class clazz = object.getClass();

//		clazz.getFields();// all public fields
		Field fields[] = clazz.getDeclaredFields(); // all fields
		for (Field field : fields) {
			System.out.println(field.getName());
		}

	}

	public void showClassMethods(Object object) {

		System.out.println("\nshowClassMethods:");

		Class clazz = object.getClass();

		Method methods[] = clazz.getMethods();
		for (Method method : methods) {
			System.out.println(method.getName());
		}
	}

	public void showFieldsAnnotations(Object object) {

		System.out.println("\nshowFieldsAnnotations:");

		Class clazz = object.getClass();

//		clazz.getFields();// all public fields
		Field fields[] = clazz.getDeclaredFields(); // all fields
		for (Field field : fields) {
			Annotation annotations[] = field.getAnnotations();
			for (Annotation annotation : annotations) {
				System.out.println(field.getName() + ":" + annotation.toString());
			}
		}
	}

	public void fillPrivateFields(Object object) throws IllegalArgumentException, IllegalAccessException {
		System.out.println("\nfillPrivateFields");

		Class clazz = object.getClass();

		Field fields[] = clazz.getDeclaredFields(); // all fields
		for (Field field : fields) {
			Annotation annitation = field.getAnnotation(RabbitAnnotation.class);
			if(annitation == null) {
				continue;
			}
			
			field.setAccessible(true);
			field.set(object, "field");
			field.setAccessible(false);
		}
	}
	
	public Object createNewObject(Object object) throws InstantiationException, IllegalAccessException {
		Class clazz = object.getClass();
		return clazz.newInstance();
	}
}
