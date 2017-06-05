package com.example.chenwei.debugaidlparameters;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

import java.util.List;
import java.util.Map;

public class AidlParameterService extends Service {
    public AidlParameterService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

    private IBinder mBinder = new IAidlParameters.Stub() {
        @Override
        public int useBasicTypes(int anInt, long aLong, boolean aBoolean, float aFloat, double aDouble, String aString) throws RemoteException {
            return 0;
        }

        @Override
        public IBinder useIBinderType(IBinder binder) throws RemoteException {
            return null;
        }

        @Override
        public List useListType(List<String> strings) throws RemoteException {
            return null;
        }

        @Override
        public List<String> useListType2(List<String> strings) throws RemoteException {
            return null;
        }

        @Override
        public List useListTypeParcelable(List<MyParcelable> parcelables) throws RemoteException {
            return null;
        }

        @Override
        public List<MyParcelable> useListTypeParcelable2(List<MyParcelable> parcelables) throws RemoteException {
            return null;
        }

        @Override
        public List useListTypeIBinder(List<IBinder> binders) throws RemoteException {
            return null;
        }

        @Override
        public List<IBinder> useListTypeIBinder2(List<IBinder> binders) throws RemoteException {
            return null;
        }

        @Override
        public void useMapTypeAsParameterType(Map maps) throws RemoteException {

        }

        @Override
        public Map useMapTypeAsReturnType() throws RemoteException {
            return null;
        }

        @Override
        public IDummy useInterfaceType(IDummy dummyInterface) throws RemoteException {
            return null;
        }

        @Override
        public MyParcelable useParcelableType(MyParcelable parcelableObj) throws RemoteException {
            return null;
        }
    };
}
