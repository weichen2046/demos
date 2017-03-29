LOCAL_PATH:= $(call my-dir)
include $(CLEAR_VARS)

LOCAL_SRC_FILES:= \
	IHelloWorld.cpp \
	BpHelloWorld.cpp \
	BnHelloWorld.cpp

LOCAL_SHARED_LIBRARIES := \
	liblog \
	libutils \
	libbinder

LOCAL_MODULE := libhelloworld

include $(BUILD_SHARED_LIBRARY)
