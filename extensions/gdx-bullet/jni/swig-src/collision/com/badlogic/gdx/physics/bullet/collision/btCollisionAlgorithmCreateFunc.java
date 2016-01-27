/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btCollisionAlgorithmCreateFunc extends BulletBase {
	private long swigCPtr;
	
	protected btCollisionAlgorithmCreateFunc(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btCollisionAlgorithmCreateFunc, normally you should not need this constructor it's intended for low-level usage. */ 
	public btCollisionAlgorithmCreateFunc(long cPtr, boolean cMemoryOwn) {
		this("btCollisionAlgorithmCreateFunc", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btCollisionAlgorithmCreateFunc obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CollisionJNI.delete_btCollisionAlgorithmCreateFunc(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setSwapped(boolean value) {
    CollisionJNI.btCollisionAlgorithmCreateFunc_swapped_set(swigCPtr, this, value);
  }

  public boolean getSwapped() {
    return CollisionJNI.btCollisionAlgorithmCreateFunc_swapped_get(swigCPtr, this);
  }

  public btCollisionAlgorithmCreateFunc() {
    this(CollisionJNI.new_btCollisionAlgorithmCreateFunc(), true);
  }

  public btCollisionAlgorithm CreateCollisionAlgorithm(btCollisionAlgorithmConstructionInfo arg0, btCollisionObjectWrapper body0Wrap, btCollisionObjectWrapper body1Wrap) {
    long cPtr = CollisionJNI.btCollisionAlgorithmCreateFunc_CreateCollisionAlgorithm(swigCPtr, this, btCollisionAlgorithmConstructionInfo.getCPtr(arg0), arg0, btCollisionObjectWrapper.getCPtr(body0Wrap), body0Wrap, btCollisionObjectWrapper.getCPtr(body1Wrap), body1Wrap);
    return (cPtr == 0) ? null : new btCollisionAlgorithm(cPtr, false);
  }

}
