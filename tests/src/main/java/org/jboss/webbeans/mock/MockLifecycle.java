package org.jboss.webbeans.mock;

import org.jboss.webbeans.bootstrap.api.Lifecycle;

public interface MockLifecycle extends Lifecycle
{

   public abstract void initialize();

   public abstract void beginApplication();

   public abstract void endApplication();

   public abstract void resetContexts();

   public abstract void beginRequest();

   public abstract void endRequest();

   public abstract void beginSession();

   public abstract void endSession();

}