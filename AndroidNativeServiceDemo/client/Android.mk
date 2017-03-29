LOCAL_PATH:= $(call my-dir)
include $(CLEAR_VARS)

LOCAL_SRC_FILES:= \
	main_helloworld_client.cpp


LOCAL_SHARED_LIBRARIES := \
	libutils \
	libbinder \
	libhelloworld


LOCAL_MODULE:= helloworldclient

include $(BUILD_EXECUTABLE)
