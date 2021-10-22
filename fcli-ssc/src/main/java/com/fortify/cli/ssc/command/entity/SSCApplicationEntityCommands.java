/*******************************************************************************
 * (c) Copyright 2020 Micro Focus or one of its affiliates
 *
 * Permission is hereby granted, free of charge, to any person obtaining a 
 * copy of this software and associated documentation files (the 
 * "Software"), to deal in the Software without restriction, including without 
 * limitation the rights to use, copy, modify, merge, publish, distribute, 
 * sublicense, and/or sell copies of the Software, and to permit persons to 
 * whom the Software is furnished to do so, subject to the following 
 * conditions:
 * 
 * The above copyright notice and this permission notice shall be included 
 * in all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY 
 * KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE 
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR 
 * PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE 
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, 
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF 
 * CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN 
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS 
 * IN THE SOFTWARE.
 ******************************************************************************/
package com.fortify.cli.ssc.command.entity;

import com.fortify.cli.command.util.SubcommandOf;
import com.fortify.cli.ssc.command.entity.SSCEntityRootCommands.SSCCreateCommand;
import com.fortify.cli.ssc.command.entity.SSCEntityRootCommands.SSCDeleteCommand;
import com.fortify.cli.ssc.command.entity.SSCEntityRootCommands.SSCGetCommand;
import com.fortify.cli.ssc.command.entity.SSCEntityRootCommands.SSCUpdateCommand;

import jakarta.inject.Singleton;
import picocli.CommandLine.Command;

public class SSCApplicationEntityCommands {
	private static final String ENTITY = "application";
	
	@Singleton
	@SubcommandOf(SSCGetCommand.class)
	@Command(name = ENTITY, description = "Get "+ENTITY+" data from SSC")
	public static final class Get implements Runnable {
		@Override
		public void run() {
		}
	}
	
	@Singleton
	@SubcommandOf(SSCCreateCommand.class)
	@Command(name = ENTITY, description = "Create "+ENTITY+" in SSC")
	public static final class Create implements Runnable {
		@Override
		public void run() {
		}
	}
	
	@Singleton
	@SubcommandOf(SSCUpdateCommand.class)
	@Command(name = ENTITY, description = "Update "+ENTITY+" in SSC")
	public static final class Update implements Runnable {
		@Override
		public void run() {
		}
	}
	
	@Singleton
	@SubcommandOf(SSCDeleteCommand.class)
	@Command(name = ENTITY, description = "Delete "+ENTITY+" from SSC")
	public static final class Delete implements Runnable {
		@Override
		public void run() {
		}
	}
}
