/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.qpid.jms.joram;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.objectweb.jtests.jms.conform.connection.ConnectionTest;
import org.objectweb.jtests.jms.conform.connection.TopicConnectionTest;
import org.objectweb.jtests.jms.conform.message.MessageBodyTest;
import org.objectweb.jtests.jms.conform.message.MessageDefaultTest;
import org.objectweb.jtests.jms.conform.message.MessageTypeTest;
import org.objectweb.jtests.jms.conform.message.headers.MessageHeaderTest;
import org.objectweb.jtests.jms.conform.message.properties.JMSXPropertyTest;
import org.objectweb.jtests.jms.conform.message.properties.MessagePropertyConversionTest;
import org.objectweb.jtests.jms.conform.message.properties.MessagePropertyTest;
import org.objectweb.jtests.jms.conform.queue.QueueBrowserTest;
import org.objectweb.jtests.jms.conform.queue.TemporaryQueueTest;
import org.objectweb.jtests.jms.conform.selector.SelectorSyntaxTest;
import org.objectweb.jtests.jms.conform.selector.SelectorTest;
import org.objectweb.jtests.jms.conform.session.QueueSessionTest;
import org.objectweb.jtests.jms.conform.session.SessionTest;
import org.objectweb.jtests.jms.conform.session.TopicSessionTest;
import org.objectweb.jtests.jms.conform.session.UnifiedSessionTest;
import org.objectweb.jtests.jms.conform.topic.TemporaryTopicTest;

public class JoramJmsTest extends TestCase {

    public static Test suite() {
        TestSuite suite = new TestSuite();

        // Connection
        suite.addTestSuite(ConnectionTest.class);
        suite.addTestSuite(TopicConnectionTest.class);

        //Message
        suite.addTestSuite(MessageBodyTest.class);
        suite.addTestSuite(MessageDefaultTest.class);
        suite.addTestSuite(MessageTypeTest.class);

        //Message Headers
        suite.addTestSuite(MessageHeaderTest.class);

        //Message Properties
        suite.addTestSuite(JMSXPropertyTest.class);
        suite.addTestSuite(MessagePropertyConversionTest.class);
        suite.addTestSuite(MessagePropertyTest.class);

        //Queue
        suite.addTestSuite(QueueBrowserTest.class);
        suite.addTestSuite(TemporaryQueueTest.class);

        //Selector
        suite.addTestSuite(SelectorSyntaxTest.class);
        suite.addTestSuite(SelectorTest.class);

        //Session
        suite.addTestSuite(QueueSessionTest.class);
        suite.addTestSuite(SessionTest.class);
        suite.addTestSuite(TopicSessionTest.class);
        suite.addTestSuite(UnifiedSessionTest.class);

        //Topic
        suite.addTestSuite(TemporaryTopicTest.class);
        return suite;
    }

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }
}
