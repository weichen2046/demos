#include <binder/Parcel.h>

#include "BpHelloWorld.h"

namespace android {

BpHelloWorld::BpHelloWorld(const sp<IBinder>& impl)
    : BpInterface<IHelloWorld>(impl)
{
}

void BpHelloWorld::helloWorld()
{
    Parcel data, reply;

    data.writeInterfaceToken(IHelloWorld::getInterfaceDescriptor());

    // TODO: write parameter data here

    // send transaction to server
    remote()->transact(HELLO_WORLD_TRANSACTION, data, &reply, IBinder::FLAG_ONEWAY);
}

void BpHelloWorld::worldHello()
{
    Parcel data, reply;

    data.writeInterfaceToken(IHelloWorld::getInterfaceDescriptor());

    // TODO: write parameter data here
    
    // send transaction to server
    remote()->transact(WORLD_HELLO_TRANSACTION, data, &reply);
}

} // end namespace android
