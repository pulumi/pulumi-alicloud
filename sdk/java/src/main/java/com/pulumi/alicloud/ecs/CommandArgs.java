// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CommandArgs extends com.pulumi.resources.ResourceArgs {

    public static final CommandArgs Empty = new CommandArgs();

    /**
     * The Base64-encoded content of the command.
     * 
     */
    @Import(name="commandContent", required=true)
    private Output<String> commandContent;

    /**
     * @return The Base64-encoded content of the command.
     * 
     */
    public Output<String> commandContent() {
        return this.commandContent;
    }

    /**
     * The description of command.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of command.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Specifies whether to use custom parameters in the command to be created. Default to: false.
     * 
     */
    @Import(name="enableParameter")
    private @Nullable Output<Boolean> enableParameter;

    /**
     * @return Specifies whether to use custom parameters in the command to be created. Default to: false.
     * 
     */
    public Optional<Output<Boolean>> enableParameter() {
        return Optional.ofNullable(this.enableParameter);
    }

    /**
     * The name of the command, which supports all character sets. It can be up to 128 characters in length.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the command, which supports all character sets. It can be up to 128 characters in length.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The timeout period that is specified for the command to be run on ECS instances. Unit: seconds. Default to: `60`.
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<Integer> timeout;

    /**
     * @return The timeout period that is specified for the command to be run on ECS instances. Unit: seconds. Default to: `60`.
     * 
     */
    public Optional<Output<Integer>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    /**
     * The command type. Valid Values: `RunBatScript`, `RunPowerShellScript` and `RunShellScript`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The command type. Valid Values: `RunBatScript`, `RunPowerShellScript` and `RunShellScript`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * The execution path of the command in the ECS instance.
     * 
     */
    @Import(name="workingDir")
    private @Nullable Output<String> workingDir;

    /**
     * @return The execution path of the command in the ECS instance.
     * 
     */
    public Optional<Output<String>> workingDir() {
        return Optional.ofNullable(this.workingDir);
    }

    private CommandArgs() {}

    private CommandArgs(CommandArgs $) {
        this.commandContent = $.commandContent;
        this.description = $.description;
        this.enableParameter = $.enableParameter;
        this.name = $.name;
        this.timeout = $.timeout;
        this.type = $.type;
        this.workingDir = $.workingDir;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CommandArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CommandArgs $;

        public Builder() {
            $ = new CommandArgs();
        }

        public Builder(CommandArgs defaults) {
            $ = new CommandArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param commandContent The Base64-encoded content of the command.
         * 
         * @return builder
         * 
         */
        public Builder commandContent(Output<String> commandContent) {
            $.commandContent = commandContent;
            return this;
        }

        /**
         * @param commandContent The Base64-encoded content of the command.
         * 
         * @return builder
         * 
         */
        public Builder commandContent(String commandContent) {
            return commandContent(Output.of(commandContent));
        }

        /**
         * @param description The description of command.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of command.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param enableParameter Specifies whether to use custom parameters in the command to be created. Default to: false.
         * 
         * @return builder
         * 
         */
        public Builder enableParameter(@Nullable Output<Boolean> enableParameter) {
            $.enableParameter = enableParameter;
            return this;
        }

        /**
         * @param enableParameter Specifies whether to use custom parameters in the command to be created. Default to: false.
         * 
         * @return builder
         * 
         */
        public Builder enableParameter(Boolean enableParameter) {
            return enableParameter(Output.of(enableParameter));
        }

        /**
         * @param name The name of the command, which supports all character sets. It can be up to 128 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the command, which supports all character sets. It can be up to 128 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param timeout The timeout period that is specified for the command to be run on ECS instances. Unit: seconds. Default to: `60`.
         * 
         * @return builder
         * 
         */
        public Builder timeout(@Nullable Output<Integer> timeout) {
            $.timeout = timeout;
            return this;
        }

        /**
         * @param timeout The timeout period that is specified for the command to be run on ECS instances. Unit: seconds. Default to: `60`.
         * 
         * @return builder
         * 
         */
        public Builder timeout(Integer timeout) {
            return timeout(Output.of(timeout));
        }

        /**
         * @param type The command type. Valid Values: `RunBatScript`, `RunPowerShellScript` and `RunShellScript`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The command type. Valid Values: `RunBatScript`, `RunPowerShellScript` and `RunShellScript`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param workingDir The execution path of the command in the ECS instance.
         * 
         * @return builder
         * 
         */
        public Builder workingDir(@Nullable Output<String> workingDir) {
            $.workingDir = workingDir;
            return this;
        }

        /**
         * @param workingDir The execution path of the command in the ECS instance.
         * 
         * @return builder
         * 
         */
        public Builder workingDir(String workingDir) {
            return workingDir(Output.of(workingDir));
        }

        public CommandArgs build() {
            if ($.commandContent == null) {
                throw new MissingRequiredPropertyException("CommandArgs", "commandContent");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("CommandArgs", "type");
            }
            return $;
        }
    }

}
