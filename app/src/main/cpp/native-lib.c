#include <jni.h>


JNIEXPORT jstring JNICALL Java_com_example_myapp_MainActivity_stringFromC(
        JNIEnv* env, // Puntero al entorno JNI
        jobject thiz) { // Referencia al objeto de la clase llamante

    // Código C puro
    const char *hello = "Hola desde Código C Puro!";

    // Devuelve una cadena JNI (jstring)
    return (*env)->NewStringUTF(env, hello);
}