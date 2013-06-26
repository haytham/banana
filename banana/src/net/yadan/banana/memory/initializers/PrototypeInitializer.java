package net.yadan.banana.memory.initializers;

import net.yadan.banana.memory.IPrimitiveAccess;
import net.yadan.banana.memory.MemInitializer;

public class PrototypeInitializer implements MemInitializer {
  int prototype[];

  public PrototypeInitializer(int recordSize) {
    this(new int[recordSize]);

  }

  public PrototypeInitializer(int prototype_[]) {
    prototype = prototype_;
  }

  @Override
  public void initialize(IPrimitiveAccess mem, int pointer, int blockSize) {
    mem.setInts(pointer, 0, prototype, 0, prototype.length);
  }
}