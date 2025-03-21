// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.emrv2.inputs;

import com.pulumi.alicloud.emrv2.inputs.ClusterBootstrapScriptNodeSelectorArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterBootstrapScriptArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterBootstrapScriptArgs Empty = new ClusterBootstrapScriptArgs();

    /**
     * The bootstrap scripts execution fail strategy, ’FAILED_BLOCK’ or ‘FAILED_CONTINUE’ .
     * 
     */
    @Import(name="executionFailStrategy", required=true)
    private Output<String> executionFailStrategy;

    /**
     * @return The bootstrap scripts execution fail strategy, ’FAILED_BLOCK’ or ‘FAILED_CONTINUE’ .
     * 
     */
    public Output<String> executionFailStrategy() {
        return this.executionFailStrategy;
    }

    /**
     * The bootstrap scripts execution moment, ’BEFORE_INSTALL’, ‘AFTER_STARTED’ or ‘BEFORE_START’. The execution moment of BEFORE_START is available since v1.243.0.
     * 
     */
    @Import(name="executionMoment", required=true)
    private Output<String> executionMoment;

    /**
     * @return The bootstrap scripts execution moment, ’BEFORE_INSTALL’, ‘AFTER_STARTED’ or ‘BEFORE_START’. The execution moment of BEFORE_START is available since v1.243.0.
     * 
     */
    public Output<String> executionMoment() {
        return this.executionMoment;
    }

    /**
     * The bootstrap scripts execution target. See `node_selector` below.
     * 
     */
    @Import(name="nodeSelector", required=true)
    private Output<ClusterBootstrapScriptNodeSelectorArgs> nodeSelector;

    /**
     * @return The bootstrap scripts execution target. See `node_selector` below.
     * 
     */
    public Output<ClusterBootstrapScriptNodeSelectorArgs> nodeSelector() {
        return this.nodeSelector;
    }

    /**
     * The bootstrap scripts priority.
     * 
     * @deprecated
     * Field &#39;priority&#39; has been deprecated from provider version 1.227.0.
     * 
     */
    @Deprecated /* Field 'priority' has been deprecated from provider version 1.227.0. */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    /**
     * @return The bootstrap scripts priority.
     * 
     * @deprecated
     * Field &#39;priority&#39; has been deprecated from provider version 1.227.0.
     * 
     */
    @Deprecated /* Field 'priority' has been deprecated from provider version 1.227.0. */
    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * The bootstrap script args, e.g. &#34;--a=b&#34;.
     * 
     */
    @Import(name="scriptArgs", required=true)
    private Output<String> scriptArgs;

    /**
     * @return The bootstrap script args, e.g. &#34;--a=b&#34;.
     * 
     */
    public Output<String> scriptArgs() {
        return this.scriptArgs;
    }

    /**
     * The bootstrap script name.
     * 
     */
    @Import(name="scriptName", required=true)
    private Output<String> scriptName;

    /**
     * @return The bootstrap script name.
     * 
     */
    public Output<String> scriptName() {
        return this.scriptName;
    }

    /**
     * The bootstrap script path, e.g. &#34;oss://bucket/path&#34;.
     * 
     */
    @Import(name="scriptPath", required=true)
    private Output<String> scriptPath;

    /**
     * @return The bootstrap script path, e.g. &#34;oss://bucket/path&#34;.
     * 
     */
    public Output<String> scriptPath() {
        return this.scriptPath;
    }

    private ClusterBootstrapScriptArgs() {}

    private ClusterBootstrapScriptArgs(ClusterBootstrapScriptArgs $) {
        this.executionFailStrategy = $.executionFailStrategy;
        this.executionMoment = $.executionMoment;
        this.nodeSelector = $.nodeSelector;
        this.priority = $.priority;
        this.scriptArgs = $.scriptArgs;
        this.scriptName = $.scriptName;
        this.scriptPath = $.scriptPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterBootstrapScriptArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterBootstrapScriptArgs $;

        public Builder() {
            $ = new ClusterBootstrapScriptArgs();
        }

        public Builder(ClusterBootstrapScriptArgs defaults) {
            $ = new ClusterBootstrapScriptArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param executionFailStrategy The bootstrap scripts execution fail strategy, ’FAILED_BLOCK’ or ‘FAILED_CONTINUE’ .
         * 
         * @return builder
         * 
         */
        public Builder executionFailStrategy(Output<String> executionFailStrategy) {
            $.executionFailStrategy = executionFailStrategy;
            return this;
        }

        /**
         * @param executionFailStrategy The bootstrap scripts execution fail strategy, ’FAILED_BLOCK’ or ‘FAILED_CONTINUE’ .
         * 
         * @return builder
         * 
         */
        public Builder executionFailStrategy(String executionFailStrategy) {
            return executionFailStrategy(Output.of(executionFailStrategy));
        }

        /**
         * @param executionMoment The bootstrap scripts execution moment, ’BEFORE_INSTALL’, ‘AFTER_STARTED’ or ‘BEFORE_START’. The execution moment of BEFORE_START is available since v1.243.0.
         * 
         * @return builder
         * 
         */
        public Builder executionMoment(Output<String> executionMoment) {
            $.executionMoment = executionMoment;
            return this;
        }

        /**
         * @param executionMoment The bootstrap scripts execution moment, ’BEFORE_INSTALL’, ‘AFTER_STARTED’ or ‘BEFORE_START’. The execution moment of BEFORE_START is available since v1.243.0.
         * 
         * @return builder
         * 
         */
        public Builder executionMoment(String executionMoment) {
            return executionMoment(Output.of(executionMoment));
        }

        /**
         * @param nodeSelector The bootstrap scripts execution target. See `node_selector` below.
         * 
         * @return builder
         * 
         */
        public Builder nodeSelector(Output<ClusterBootstrapScriptNodeSelectorArgs> nodeSelector) {
            $.nodeSelector = nodeSelector;
            return this;
        }

        /**
         * @param nodeSelector The bootstrap scripts execution target. See `node_selector` below.
         * 
         * @return builder
         * 
         */
        public Builder nodeSelector(ClusterBootstrapScriptNodeSelectorArgs nodeSelector) {
            return nodeSelector(Output.of(nodeSelector));
        }

        /**
         * @param priority The bootstrap scripts priority.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;priority&#39; has been deprecated from provider version 1.227.0.
         * 
         */
        @Deprecated /* Field 'priority' has been deprecated from provider version 1.227.0. */
        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority The bootstrap scripts priority.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;priority&#39; has been deprecated from provider version 1.227.0.
         * 
         */
        @Deprecated /* Field 'priority' has been deprecated from provider version 1.227.0. */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param scriptArgs The bootstrap script args, e.g. &#34;--a=b&#34;.
         * 
         * @return builder
         * 
         */
        public Builder scriptArgs(Output<String> scriptArgs) {
            $.scriptArgs = scriptArgs;
            return this;
        }

        /**
         * @param scriptArgs The bootstrap script args, e.g. &#34;--a=b&#34;.
         * 
         * @return builder
         * 
         */
        public Builder scriptArgs(String scriptArgs) {
            return scriptArgs(Output.of(scriptArgs));
        }

        /**
         * @param scriptName The bootstrap script name.
         * 
         * @return builder
         * 
         */
        public Builder scriptName(Output<String> scriptName) {
            $.scriptName = scriptName;
            return this;
        }

        /**
         * @param scriptName The bootstrap script name.
         * 
         * @return builder
         * 
         */
        public Builder scriptName(String scriptName) {
            return scriptName(Output.of(scriptName));
        }

        /**
         * @param scriptPath The bootstrap script path, e.g. &#34;oss://bucket/path&#34;.
         * 
         * @return builder
         * 
         */
        public Builder scriptPath(Output<String> scriptPath) {
            $.scriptPath = scriptPath;
            return this;
        }

        /**
         * @param scriptPath The bootstrap script path, e.g. &#34;oss://bucket/path&#34;.
         * 
         * @return builder
         * 
         */
        public Builder scriptPath(String scriptPath) {
            return scriptPath(Output.of(scriptPath));
        }

        public ClusterBootstrapScriptArgs build() {
            if ($.executionFailStrategy == null) {
                throw new MissingRequiredPropertyException("ClusterBootstrapScriptArgs", "executionFailStrategy");
            }
            if ($.executionMoment == null) {
                throw new MissingRequiredPropertyException("ClusterBootstrapScriptArgs", "executionMoment");
            }
            if ($.nodeSelector == null) {
                throw new MissingRequiredPropertyException("ClusterBootstrapScriptArgs", "nodeSelector");
            }
            if ($.scriptArgs == null) {
                throw new MissingRequiredPropertyException("ClusterBootstrapScriptArgs", "scriptArgs");
            }
            if ($.scriptName == null) {
                throw new MissingRequiredPropertyException("ClusterBootstrapScriptArgs", "scriptName");
            }
            if ($.scriptPath == null) {
                throw new MissingRequiredPropertyException("ClusterBootstrapScriptArgs", "scriptPath");
            }
            return $;
        }
    }

}
