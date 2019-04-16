// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cpython.global.python.*;


@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyInterpreterState extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyInterpreterState() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyInterpreterState(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyInterpreterState(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyInterpreterState position(long position) {
        return (PyInterpreterState)super.position(position);
    }


    public native _is next(); public native PyInterpreterState next(_is setter);
    public native _ts tstate_head(); public native PyInterpreterState tstate_head(_ts setter);

    public native PyObject modules(); public native PyInterpreterState modules(PyObject setter);
    public native PyObject modules_by_index(); public native PyInterpreterState modules_by_index(PyObject setter);
    public native PyObject sysdict(); public native PyInterpreterState sysdict(PyObject setter);
    public native PyObject builtins(); public native PyInterpreterState builtins(PyObject setter);
    public native PyObject importlib(); public native PyInterpreterState importlib(PyObject setter);

    public native PyObject codec_search_path(); public native PyInterpreterState codec_search_path(PyObject setter);
    public native PyObject codec_search_cache(); public native PyInterpreterState codec_search_cache(PyObject setter);
    public native PyObject codec_error_registry(); public native PyInterpreterState codec_error_registry(PyObject setter);
    public native int codecs_initialized(); public native PyInterpreterState codecs_initialized(int setter);
    public native int fscodec_initialized(); public native PyInterpreterState fscodec_initialized(int setter);

// #ifdef HAVE_DLOPEN
// #endif

    public native PyObject builtins_copy(); public native PyInterpreterState builtins_copy(PyObject setter);
    public native PyObject import_func(); public native PyInterpreterState import_func(PyObject setter);
    /* Initialized to PyEval_EvalFrameDefault(). */
    public native _PyFrameEvalFunction eval_frame(); public native PyInterpreterState eval_frame(_PyFrameEvalFunction setter);
}
