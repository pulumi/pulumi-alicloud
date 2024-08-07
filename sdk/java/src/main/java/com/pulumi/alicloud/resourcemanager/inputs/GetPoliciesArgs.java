// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.resourcemanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPoliciesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPoliciesArgs Empty = new GetPoliciesArgs();

    /**
     * A list of Resource Manager Policy IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of Resource Manager Policy IDs.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to filter results by policy name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable Output<String> nameRegex;

    /**
     * @return A regex string to filter results by policy name.
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

    /**
     * The type of the policy. If you do not specify this parameter, the system lists all types of policies. Valid values: `Custom` and `System`.
     * 
     */
    @Import(name="policyType")
    private @Nullable Output<String> policyType;

    /**
     * @return The type of the policy. If you do not specify this parameter, the system lists all types of policies. Valid values: `Custom` and `System`.
     * 
     */
    public Optional<Output<String>> policyType() {
        return Optional.ofNullable(this.policyType);
    }

    private GetPoliciesArgs() {}

    private GetPoliciesArgs(GetPoliciesArgs $) {
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.policyType = $.policyType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPoliciesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPoliciesArgs $;

        public Builder() {
            $ = new GetPoliciesArgs();
        }

        public Builder(GetPoliciesArgs defaults) {
            $ = new GetPoliciesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of Resource Manager Policy IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Resource Manager Policy IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of Resource Manager Policy IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string to filter results by policy name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable Output<String> nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by policy name.
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

        /**
         * @param policyType The type of the policy. If you do not specify this parameter, the system lists all types of policies. Valid values: `Custom` and `System`.
         * 
         * @return builder
         * 
         */
        public Builder policyType(@Nullable Output<String> policyType) {
            $.policyType = policyType;
            return this;
        }

        /**
         * @param policyType The type of the policy. If you do not specify this parameter, the system lists all types of policies. Valid values: `Custom` and `System`.
         * 
         * @return builder
         * 
         */
        public Builder policyType(String policyType) {
            return policyType(Output.of(policyType));
        }

        public GetPoliciesArgs build() {
            return $;
        }
    }

}
