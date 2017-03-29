#include <binder/IServiceManager.h>
#include <binder/ProcessState.h>

#include "../libhelloworld/IHelloWorld.h"

using namespace android;

int main(int argc, char** argv){

    sp<ProcessState> proc(ProcessState::self());
    sp<IServiceManager> sm = defaultServiceManager();

    sp<IBinder> binder = sm->getService(String16("helloworld"));
    sp<IHelloWorld> helloworld = interface_cast<IHelloWorld>(binder);

    // call service method
    helloworld->helloWorld();
    helloworld->worldHello();

    return 0;
}
