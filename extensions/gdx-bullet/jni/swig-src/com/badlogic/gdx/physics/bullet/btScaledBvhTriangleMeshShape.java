/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btScaledBvhTriangleMeshShape extends btConcaveShape {
  private long swigCPtr;

  protected btScaledBvhTriangleMeshShape(long cPtr, boolean cMemoryOwn) {
    super(gdxBulletJNI.btScaledBvhTriangleMeshShape_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(btScaledBvhTriangleMeshShape obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btScaledBvhTriangleMeshShape(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public btScaledBvhTriangleMeshShape(btBvhTriangleMeshShape childShape, Vector3 localScaling) {
    this(gdxBulletJNI.new_btScaledBvhTriangleMeshShape(btBvhTriangleMeshShape.getCPtr(childShape), childShape, localScaling), true);
  }

  public btBvhTriangleMeshShape getChildShape() {
    long cPtr = gdxBulletJNI.btScaledBvhTriangleMeshShape_getChildShape__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new btBvhTriangleMeshShape(cPtr, false);
  }

}
