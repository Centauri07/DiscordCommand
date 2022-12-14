/*
 *  Copyright 2022 Centauri07
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package me.centauri07.dc.api.command

import me.centauri07.dc.api.command.option.CommandOption
import me.centauri07.dc.api.executor.Executor
import net.dv8tion.jda.api.Permission

/**
 * @author Centauri07
 *
 * This class represents the registered commands to get or weill be executed.
 */
interface Command {

    /**
     * The parent of this command. If the parent is not null, it means
     * that this is a sub command of a command, otherwise, this is the
     * parent command.
     */
    var parent: Command?

    /**
     * How deep this is from parent command. Value is zero if this is a
     * parent command.
     */
    val depth: Int

    /**
     * Used to get the registered command object that has been registered.
     * Name must be unique since this is the identifier to get the registered command object.
     * Format should be in lowercase.
     */
    val name: String

    /**
     * A brief explanation of the command's behaviour.
     */
    val description: String

    /**
     * Used to execute the command's behaviour by a pre-defined function
     * when getting called.
     */
    val executor: Executor?

    /**
     * List of command option of the command.
     */
    val commandOptions: List<CommandOption>

    /**
     * List of the permission of the command.
     */
    val permissions: List<Permission>

    /**
     * List of sub command of the command.
     * String -> Command, where the String represents the subcommand name
     * and the command is the representation of the command object.
     */
    val subCommands: Map<String, Command>

    /**
     * Event class of the command.
     * This determines whether the command is SlashCommand or other type.
     */
    val type: Class<*>

}