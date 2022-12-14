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

package me.centauri07.dc.api.executor

import me.centauri07.dc.api.argument.Argument
import me.centauri07.dc.api.response.Response
import net.dv8tion.jda.api.entities.Member
import net.dv8tion.jda.api.events.Event

/**
 * @author Centauri07
 *
 * This class provides method to be called when a command has been invoked.
 */
interface Executor {

    /**
     * The command's behaviour.
     * This function will be called when a command is invoked.
     *
     * @param executor  the executor of the command
     * @param arguments the arguments provided by the executor
     * @param event     the event that was triggered when invoking the command
     */
    fun onCommand(executor: Member, arguments: List<Argument>, event: Event): Response

}