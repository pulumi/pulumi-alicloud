// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class LoadBalancerAccessLogConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerAccessLogConfigArgs Empty = new LoadBalancerAccessLogConfigArgs();

    /**
     * This Log Storage Project.
     * 
     */
    @Import(name="logProject", required=true)
    private Output<String> logProject;

    /**
     * @return This Log Storage Project.
     * 
     */
    public Output<String> logProject() {
        return this.logProject;
    }

    /**
     * This Log Storage Method Is Increased.
     * 
     */
    @Import(name="logStore", required=true)
    private Output<String> logStore;

    /**
     * @return This Log Storage Method Is Increased.
     * 
     */
    public Output<String> logStore() {
        return this.logStore;
    }

    private LoadBalancerAccessLogConfigArgs() {}

    private LoadBalancerAccessLogConfigArgs(LoadBalancerAccessLogConfigArgs $) {
        this.logProject = $.logProject;
        this.logStore = $.logStore;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerAccessLogConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerAccessLogConfigArgs $;

        public Builder() {
            $ = new LoadBalancerAccessLogConfigArgs();
        }

        public Builder(LoadBalancerAccessLogConfigArgs defaults) {
            $ = new LoadBalancerAccessLogConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param logProject This Log Storage Project.
         * 
         * @return builder
         * 
         */
        public Builder logProject(Output<String> logProject) {
            $.logProject = logProject;
            return this;
        }

        /**
         * @param logProject This Log Storage Project.
         * 
         * @return builder
         * 
         */
        public Builder logProject(String logProject) {
            return logProject(Output.of(logProject));
        }

        /**
         * @param logStore This Log Storage Method Is Increased.
         * 
         * @return builder
         * 
         */
        public Builder logStore(Output<String> logStore) {
            $.logStore = logStore;
            return this;
        }

        /**
         * @param logStore This Log Storage Method Is Increased.
         * 
         * @return builder
         * 
         */
        public Builder logStore(String logStore) {
            return logStore(Output.of(logStore));
        }

        public LoadBalancerAccessLogConfigArgs build() {
            if ($.logProject == null) {
                throw new MissingRequiredPropertyException("LoadBalancerAccessLogConfigArgs", "logProject");
            }
            if ($.logStore == null) {
                throw new MissingRequiredPropertyException("LoadBalancerAccessLogConfigArgs", "logStore");
            }
            return $;
        }
    }

}