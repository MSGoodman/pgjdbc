/*
 * Copyright (c) 2003, PostgreSQL Global Development Group
 * See the LICENSE file in the project root for more information.
 */

package org.postgresql;

import java.sql.SQLException;

/**
 * This interface defines the public PostgreSQL extension for Notification Listeners.
 */
public abstract class PGNotificationListener {
  public abstract void handleNotification(PGNotification notification) throws SQLException;

  public void handleSQLException(SQLException e) {
    // NOOP by default, this method exists to encourage overriding on listener creation.
  }

  public void handleInterruptedException(InterruptedException e) {
    // NOOP by default, this method exists to encourage overriding on listener creation.
  }
}
