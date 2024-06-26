// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.threatdetection;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClientFileProtectArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClientFileProtectArgs Empty = new ClientFileProtectArgs();

    /**
     * 0 no alert 1 info 2 suspicious 3 critical.
     * 
     */
    @Import(name="alertLevel")
    private @Nullable Output<Integer> alertLevel;

    /**
     * @return 0 no alert 1 info 2 suspicious 3 critical.
     * 
     */
    public Optional<Output<Integer>> alertLevel() {
        return Optional.ofNullable(this.alertLevel);
    }

    /**
     * file operation.
     * 
     */
    @Import(name="fileOps", required=true)
    private Output<List<String>> fileOps;

    /**
     * @return file operation.
     * 
     */
    public Output<List<String>> fileOps() {
        return this.fileOps;
    }

    /**
     * file path.
     * 
     */
    @Import(name="filePaths", required=true)
    private Output<List<String>> filePaths;

    /**
     * @return file path.
     * 
     */
    public Output<List<String>> filePaths() {
        return this.filePaths;
    }

    /**
     * process path.
     * 
     */
    @Import(name="procPaths", required=true)
    private Output<List<String>> procPaths;

    /**
     * @return process path.
     * 
     */
    public Output<List<String>> procPaths() {
        return this.procPaths;
    }

    /**
     * rule action, pass or alert.
     * 
     */
    @Import(name="ruleAction", required=true)
    private Output<String> ruleAction;

    /**
     * @return rule action, pass or alert.
     * 
     */
    public Output<String> ruleAction() {
        return this.ruleAction;
    }

    /**
     * ruleName.
     * 
     */
    @Import(name="ruleName", required=true)
    private Output<String> ruleName;

    /**
     * @return ruleName.
     * 
     */
    public Output<String> ruleName() {
        return this.ruleName;
    }

    /**
     * rule status 0 is disable 1 is enable.
     * 
     */
    @Import(name="status")
    private @Nullable Output<Integer> status;

    /**
     * @return rule status 0 is disable 1 is enable.
     * 
     */
    public Optional<Output<Integer>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * switch id.
     * 
     */
    @Import(name="switchId")
    private @Nullable Output<String> switchId;

    /**
     * @return switch id.
     * 
     */
    public Optional<Output<String>> switchId() {
        return Optional.ofNullable(this.switchId);
    }

    private ClientFileProtectArgs() {}

    private ClientFileProtectArgs(ClientFileProtectArgs $) {
        this.alertLevel = $.alertLevel;
        this.fileOps = $.fileOps;
        this.filePaths = $.filePaths;
        this.procPaths = $.procPaths;
        this.ruleAction = $.ruleAction;
        this.ruleName = $.ruleName;
        this.status = $.status;
        this.switchId = $.switchId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClientFileProtectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClientFileProtectArgs $;

        public Builder() {
            $ = new ClientFileProtectArgs();
        }

        public Builder(ClientFileProtectArgs defaults) {
            $ = new ClientFileProtectArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alertLevel 0 no alert 1 info 2 suspicious 3 critical.
         * 
         * @return builder
         * 
         */
        public Builder alertLevel(@Nullable Output<Integer> alertLevel) {
            $.alertLevel = alertLevel;
            return this;
        }

        /**
         * @param alertLevel 0 no alert 1 info 2 suspicious 3 critical.
         * 
         * @return builder
         * 
         */
        public Builder alertLevel(Integer alertLevel) {
            return alertLevel(Output.of(alertLevel));
        }

        /**
         * @param fileOps file operation.
         * 
         * @return builder
         * 
         */
        public Builder fileOps(Output<List<String>> fileOps) {
            $.fileOps = fileOps;
            return this;
        }

        /**
         * @param fileOps file operation.
         * 
         * @return builder
         * 
         */
        public Builder fileOps(List<String> fileOps) {
            return fileOps(Output.of(fileOps));
        }

        /**
         * @param fileOps file operation.
         * 
         * @return builder
         * 
         */
        public Builder fileOps(String... fileOps) {
            return fileOps(List.of(fileOps));
        }

        /**
         * @param filePaths file path.
         * 
         * @return builder
         * 
         */
        public Builder filePaths(Output<List<String>> filePaths) {
            $.filePaths = filePaths;
            return this;
        }

        /**
         * @param filePaths file path.
         * 
         * @return builder
         * 
         */
        public Builder filePaths(List<String> filePaths) {
            return filePaths(Output.of(filePaths));
        }

        /**
         * @param filePaths file path.
         * 
         * @return builder
         * 
         */
        public Builder filePaths(String... filePaths) {
            return filePaths(List.of(filePaths));
        }

        /**
         * @param procPaths process path.
         * 
         * @return builder
         * 
         */
        public Builder procPaths(Output<List<String>> procPaths) {
            $.procPaths = procPaths;
            return this;
        }

        /**
         * @param procPaths process path.
         * 
         * @return builder
         * 
         */
        public Builder procPaths(List<String> procPaths) {
            return procPaths(Output.of(procPaths));
        }

        /**
         * @param procPaths process path.
         * 
         * @return builder
         * 
         */
        public Builder procPaths(String... procPaths) {
            return procPaths(List.of(procPaths));
        }

        /**
         * @param ruleAction rule action, pass or alert.
         * 
         * @return builder
         * 
         */
        public Builder ruleAction(Output<String> ruleAction) {
            $.ruleAction = ruleAction;
            return this;
        }

        /**
         * @param ruleAction rule action, pass or alert.
         * 
         * @return builder
         * 
         */
        public Builder ruleAction(String ruleAction) {
            return ruleAction(Output.of(ruleAction));
        }

        /**
         * @param ruleName ruleName.
         * 
         * @return builder
         * 
         */
        public Builder ruleName(Output<String> ruleName) {
            $.ruleName = ruleName;
            return this;
        }

        /**
         * @param ruleName ruleName.
         * 
         * @return builder
         * 
         */
        public Builder ruleName(String ruleName) {
            return ruleName(Output.of(ruleName));
        }

        /**
         * @param status rule status 0 is disable 1 is enable.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<Integer> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status rule status 0 is disable 1 is enable.
         * 
         * @return builder
         * 
         */
        public Builder status(Integer status) {
            return status(Output.of(status));
        }

        /**
         * @param switchId switch id.
         * 
         * @return builder
         * 
         */
        public Builder switchId(@Nullable Output<String> switchId) {
            $.switchId = switchId;
            return this;
        }

        /**
         * @param switchId switch id.
         * 
         * @return builder
         * 
         */
        public Builder switchId(String switchId) {
            return switchId(Output.of(switchId));
        }

        public ClientFileProtectArgs build() {
            if ($.fileOps == null) {
                throw new MissingRequiredPropertyException("ClientFileProtectArgs", "fileOps");
            }
            if ($.filePaths == null) {
                throw new MissingRequiredPropertyException("ClientFileProtectArgs", "filePaths");
            }
            if ($.procPaths == null) {
                throw new MissingRequiredPropertyException("ClientFileProtectArgs", "procPaths");
            }
            if ($.ruleAction == null) {
                throw new MissingRequiredPropertyException("ClientFileProtectArgs", "ruleAction");
            }
            if ($.ruleName == null) {
                throw new MissingRequiredPropertyException("ClientFileProtectArgs", "ruleName");
            }
            return $;
        }
    }

}
