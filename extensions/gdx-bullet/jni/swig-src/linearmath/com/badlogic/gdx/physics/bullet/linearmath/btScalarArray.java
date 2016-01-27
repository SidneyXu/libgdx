/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.linearmath;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btScalarArray extends BulletBase {
	private long swigCPtr;
	
	protected btScalarArray(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btScalarArray, normally you should not need this constructor it's intended for low-level usage. */ 
	public btScalarArray(long cPtr, boolean cMemoryOwn) {
		this("btScalarArray", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btScalarArray obj) {
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
				LinearMathJNI.delete_btScalarArray(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btScalarArray() {
    this(LinearMathJNI.new_btScalarArray__SWIG_0(), true);
  }

  public btScalarArray(btScalarArray otherArray) {
    this(LinearMathJNI.new_btScalarArray__SWIG_1(btScalarArray.getCPtr(otherArray), otherArray), true);
  }

  public int size() {
    return LinearMathJNI.btScalarArray_size(swigCPtr, this);
  }

  public float at(int n) {
    return LinearMathJNI.btScalarArray_at__SWIG_0(swigCPtr, this, n);
  }

  public void clear() {
    LinearMathJNI.btScalarArray_clear(swigCPtr, this);
  }

  public void pop_back() {
    LinearMathJNI.btScalarArray_pop_back(swigCPtr, this);
  }

  public void resizeNoInitialize(int newsize) {
    LinearMathJNI.btScalarArray_resizeNoInitialize(swigCPtr, this, newsize);
  }

  public void resize(int newsize, float fillData) {
    LinearMathJNI.btScalarArray_resize__SWIG_0(swigCPtr, this, newsize, fillData);
  }

  public void resize(int newsize) {
    LinearMathJNI.btScalarArray_resize__SWIG_1(swigCPtr, this, newsize);
  }

  public SWIGTYPE_p_float expandNonInitializing() {
    return new SWIGTYPE_p_float(LinearMathJNI.btScalarArray_expandNonInitializing(swigCPtr, this), false);
  }

  public SWIGTYPE_p_float expand(float fillValue) {
    return new SWIGTYPE_p_float(LinearMathJNI.btScalarArray_expand__SWIG_0(swigCPtr, this, fillValue), false);
  }

  public SWIGTYPE_p_float expand() {
    return new SWIGTYPE_p_float(LinearMathJNI.btScalarArray_expand__SWIG_1(swigCPtr, this), false);
  }

  public void push_back(float _Val) {
    LinearMathJNI.btScalarArray_push_back(swigCPtr, this, _Val);
  }

  public int capacity() {
    return LinearMathJNI.btScalarArray_capacity(swigCPtr, this);
  }

  public void reserve(int _Count) {
    LinearMathJNI.btScalarArray_reserve(swigCPtr, this, _Count);
  }

  static public class less extends BulletBase {
  	private long swigCPtr;
  	
  	protected less(final String className, long cPtr, boolean cMemoryOwn) {
  		super(className, cPtr, cMemoryOwn);
  		swigCPtr = cPtr;
  	}
  	
  	/** Construct a new less, normally you should not need this constructor it's intended for low-level usage. */ 
  	public less(long cPtr, boolean cMemoryOwn) {
  		this("less", cPtr, cMemoryOwn);
  		construct();
  	}
  	
  	@Override
  	protected void reset(long cPtr, boolean cMemoryOwn) {
  		if (!destroyed)
  			destroy();
  		super.reset(swigCPtr = cPtr, cMemoryOwn);
  	}
  	
  	public static long getCPtr(less obj) {
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
  				LinearMathJNI.delete_btScalarArray_less(swigCPtr);
  			}
  			swigCPtr = 0;
  		}
  		super.delete();
  	}
  
    public less() {
      this(LinearMathJNI.new_btScalarArray_less(), true);
    }
  
  }

  public void swap(int index0, int index1) {
    LinearMathJNI.btScalarArray_swap(swigCPtr, this, index0, index1);
  }

  public int findBinarySearch(float key) {
    return LinearMathJNI.btScalarArray_findBinarySearch(swigCPtr, this, key);
  }

  public int findLinearSearch(float key) {
    return LinearMathJNI.btScalarArray_findLinearSearch(swigCPtr, this, key);
  }

  public void remove(float key) {
    LinearMathJNI.btScalarArray_remove(swigCPtr, this, key);
  }

  public void initializeFromBuffer(long buffer, int size, int capacity) {
    LinearMathJNI.btScalarArray_initializeFromBuffer(swigCPtr, this, buffer, size, capacity);
  }

  public void copyFromArray(btScalarArray otherArray) {
    LinearMathJNI.btScalarArray_copyFromArray(swigCPtr, this, btScalarArray.getCPtr(otherArray), otherArray);
  }

}
