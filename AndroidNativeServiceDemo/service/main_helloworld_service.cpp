#include <binder/IPCThreadState.h>
#include <binder/ProcessState.h>
#include <binder/IServiceManager.h>

#include "../libhelloworld/BnHelloWorld.h"

using namespace android;

int main(int argc, char** argv){

    sp<ProcessState> proc(ProcessState::self());
    sp<IServiceManager> sm = defaultServiceManager();

    // publish helloworld service
    // NOTE: service name does not have to be the same with service descriptor.
    // descriptor of helloword service defined in IHelloWorld.h as "com.example.IHelloWorld",
    // service name of helloworld service can be defined as "helloworld" here.
    sm->addService(String16("helloworld"), new BnHelloWorld());

    // publish other service
    
    // start a new thread and loop on it
    proc->startThreadPool();

    // loop on main thread
    IPCThreadState::self()->joinThreadPool();

    return 0;
}
