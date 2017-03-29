#include <binder/IPCThreadState.h>
#include <binder/ProcessState.h>
#include <binder/IServiceManager.h>

#include "../libhelloworld/HelloWorld.h"

using namespace android;

int main(int argc, char** argv){

    sp<ProcessState> proc(ProcessState::self());
    sp<IServiceManager> sm = defaultServiceManager();

    // publish helloworld service
    HelloWorld::instantiate();

    // publish other service
    
    // start a new thread and loop on it
    proc->startThreadPool();

    // loop on main thread
    IPCThreadState::self()->joinThreadPool();

    return 0;
}
