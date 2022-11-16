// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.fc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ServiceLogConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceLogConfigArgs Empty = new ServiceLogConfigArgs();

    /**
     * The log store name of Alicloud Simple Log Service.
     * 
     */
    @Import(name="logstore", required=true)
    private Output<String> logstore;

    /**
     * @return The log store name of Alicloud Simple Log Service.
     * 
     */
    public Output<String> logstore() {
        return this.logstore;
    }

    /**
     * The project name of the Alicloud Simple Log Service.
     * 
     */
    @Import(name="project", required=true)
    private Output<String> project;

    /**
     * @return The project name of the Alicloud Simple Log Service.
     * 
     */
    public Output<String> project() {
        return this.project;
    }

    private ServiceLogConfigArgs() {}

    private ServiceLogConfigArgs(ServiceLogConfigArgs $) {
        this.logstore = $.logstore;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceLogConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceLogConfigArgs $;

        public Builder() {
            $ = new ServiceLogConfigArgs();
        }

        public Builder(ServiceLogConfigArgs defaults) {
            $ = new ServiceLogConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param logstore The log store name of Alicloud Simple Log Service.
         * 
         * @return builder
         * 
         */
        public Builder logstore(Output<String> logstore) {
            $.logstore = logstore;
            return this;
        }

        /**
         * @param logstore The log store name of Alicloud Simple Log Service.
         * 
         * @return builder
         * 
         */
        public Builder logstore(String logstore) {
            return logstore(Output.of(logstore));
        }

        /**
         * @param project The project name of the Alicloud Simple Log Service.
         * 
         * @return builder
         * 
         */
        public Builder project(Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The project name of the Alicloud Simple Log Service.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        public ServiceLogConfigArgs build() {
            $.logstore = Objects.requireNonNull($.logstore, "expected parameter 'logstore' to be non-null");
            $.project = Objects.requireNonNull($.project, "expected parameter 'project' to be non-null");
            return $;
        }
    }

}