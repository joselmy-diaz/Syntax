#include <jni.h>

JNIEXPORT jstring JNICALL Java_com_example_syntax_MainActivity_stringFromC(JNIEnv* env, jobject thiz) {
    return (*env)->NewStringUTF(env, "Hola klk");
}