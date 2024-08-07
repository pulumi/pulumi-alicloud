// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eventbridge.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEventBusesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEventBusesArgs Empty = new GetEventBusesArgs();

    /**
     * The event bus type.
     * 
     */
    @Import(name="eventBusType")
    private @Nullable Output<String> eventBusType;

    /**
     * @return The event bus type.
     * 
     */
    public Optional<Output<String>> eventBusType() {
        return Optional.ofNullable(this.eventBusType);
    }

    /**
     * A list of Event Bus IDs. Its element value is same as Event Bus Name.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of Event Bus IDs. Its element value is same as Event Bus Name.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * The name prefix.
     * 
     */
    @Import(name="namePrefix")
    private @Nullable Output<String> namePrefix;

    /**
     * @return The name prefix.
     * 
     */
    public Optional<Output<String>> namePrefix() {
        return Optional.ofNullable(this.namePrefix);
    }

    /**
     * A regex string to filter results by Event Bus name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable Output<String> nameRegex;

    /**
     * @return A regex string to filter results by Event Bus name.
     * 
     */
    public Optional<Output<String>> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    /**
     * File name where to save data source results (after running `pulumi preview`).
     * 
     */
    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    /**
     * @return File name where to save data source results (after running `pulumi preview`).
     * 
     */
    public Optional<Output<String>> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    private GetEventBusesArgs() {}

    private GetEventBusesArgs(GetEventBusesArgs $) {
        this.eventBusType = $.eventBusType;
        this.ids = $.ids;
        this.namePrefix = $.namePrefix;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEventBusesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEventBusesArgs $;

        public Builder() {
            $ = new GetEventBusesArgs();
        }

        public Builder(GetEventBusesArgs defaults) {
            $ = new GetEventBusesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param eventBusType The event bus type.
         * 
         * @return builder
         * 
         */
        public Builder eventBusType(@Nullable Output<String> eventBusType) {
            $.eventBusType = eventBusType;
            return this;
        }

        /**
         * @param eventBusType The event bus type.
         * 
         * @return builder
         * 
         */
        public Builder eventBusType(String eventBusType) {
            return eventBusType(Output.of(eventBusType));
        }

        /**
         * @param ids A list of Event Bus IDs. Its element value is same as Event Bus Name.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Event Bus IDs. Its element value is same as Event Bus Name.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of Event Bus IDs. Its element value is same as Event Bus Name.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param namePrefix The name prefix.
         * 
         * @return builder
         * 
         */
        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            $.namePrefix = namePrefix;
            return this;
        }

        /**
         * @param namePrefix The name prefix.
         * 
         * @return builder
         * 
         */
        public Builder namePrefix(String namePrefix) {
            return namePrefix(Output.of(namePrefix));
        }

        /**
         * @param nameRegex A regex string to filter results by Event Bus name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable Output<String> nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by Event Bus name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(String nameRegex) {
            return nameRegex(Output.of(nameRegex));
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(String outputFile) {
            return outputFile(Output.of(outputFile));
        }

        public GetEventBusesArgs build() {
            return $;
        }
    }

}
