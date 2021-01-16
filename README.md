sbt: binary incompatibility?
============================

This repo attempts to reproduce a binary incompatibility that was reported when using Hydra 2.3.0 together with sbt 1.4.6.

```
java.lang.NoSuchMethodError: 'boolean xsbti.compile.CompileProgress.advance(int, int)'
at xsbt.ZincCompiler$ZincRun.progress(CallbackGlobal.scala:91)
at scala.tools.nsc.Global$Run.refreshProgress(Global.scala:1473)
at scala.tools.nsc.Global$Run.advanceUnit(Global.scala:1430)
at scala.tools.nsc.Global$GlobalPhase.applyPhase(Global.scala:571)
at scala.tools.nsc.Global$GlobalPhase.run(Global.scala:506)
at scala.tools.nsc.Global$Run.compileUnitsInternal(Global.scala:1677)
at scala.tools.nsc.Global$Run.compileUnits(Global.scala:1651)
at scala.tools.nsc.Global$Run.compileSources(Global.scala:1644)
at scala.tools.nsc.Global$Run.compileFiles(Global.scala:1865)
at com.triplequote.hydra.compiler.ScalaWorker$ScalaCompilationRound.compile(ScalaWorker.scala:123)
at com.triplequote.hydra.compiler.ScalaWorker.compile(ScalaWorker.scala:72)
at com.triplequote.hydra.WorkerThread.$anonfun$run$1(WorkerThread.scala:41)
at scala.runtime.java8.JFunction0$mcV$sp.apply(JFunction0$mcV$sp.java:23)
at com.triplequote.hydra.compiler.utils.Utils$.timed(Utils.scala:34)
at com.triplequote.hydra.WorkerThread.run(WorkerThread.scala:41)
[error] A Hydra worker crashed during compilation.
```
