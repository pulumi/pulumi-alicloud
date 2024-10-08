// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ram.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGroupsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGroupsArgs Empty = new GetGroupsArgs();

    /**
     * A regex string to filter the returned groups by their names.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable Output<String> nameRegex;

    /**
     * @return A regex string to filter the returned groups by their names.
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
     * Filter the results by a specific policy name. If you set this parameter without setting `policy_type`, it will be automatically set to `System`.
     * 
     */
    @Import(name="policyName")
    private @Nullable Output<String> policyName;

    /**
     * @return Filter the results by a specific policy name. If you set this parameter without setting `policy_type`, it will be automatically set to `System`.
     * 
     */
    public Optional<Output<String>> policyName() {
        return Optional.ofNullable(this.policyName);
    }

    /**
     * Filter the results by a specific policy type. Valid items are `Custom` and `System`. If you set this parameter, you must set `policy_name` as well.
     * 
     */
    @Import(name="policyType")
    private @Nullable Output<String> policyType;

    /**
     * @return Filter the results by a specific policy type. Valid items are `Custom` and `System`. If you set this parameter, you must set `policy_name` as well.
     * 
     */
    public Optional<Output<String>> policyType() {
        return Optional.ofNullable(this.policyType);
    }

    /**
     * Filter the results by a specific the user name.
     * 
     */
    @Import(name="userName")
    private @Nullable Output<String> userName;

    /**
     * @return Filter the results by a specific the user name.
     * 
     */
    public Optional<Output<String>> userName() {
        return Optional.ofNullable(this.userName);
    }

    private GetGroupsArgs() {}

    private GetGroupsArgs(GetGroupsArgs $) {
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.policyName = $.policyName;
        this.policyType = $.policyType;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGroupsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGroupsArgs $;

        public Builder() {
            $ = new GetGroupsArgs();
        }

        public Builder(GetGroupsArgs defaults) {
            $ = new GetGroupsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param nameRegex A regex string to filter the returned groups by their names.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable Output<String> nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter the returned groups by their names.
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
         * @param policyName Filter the results by a specific policy name. If you set this parameter without setting `policy_type`, it will be automatically set to `System`.
         * 
         * @return builder
         * 
         */
        public Builder policyName(@Nullable Output<String> policyName) {
            $.policyName = policyName;
            return this;
        }

        /**
         * @param policyName Filter the results by a specific policy name. If you set this parameter without setting `policy_type`, it will be automatically set to `System`.
         * 
         * @return builder
         * 
         */
        public Builder policyName(String policyName) {
            return policyName(Output.of(policyName));
        }

        /**
         * @param policyType Filter the results by a specific policy type. Valid items are `Custom` and `System`. If you set this parameter, you must set `policy_name` as well.
         * 
         * @return builder
         * 
         */
        public Builder policyType(@Nullable Output<String> policyType) {
            $.policyType = policyType;
            return this;
        }

        /**
         * @param policyType Filter the results by a specific policy type. Valid items are `Custom` and `System`. If you set this parameter, you must set `policy_name` as well.
         * 
         * @return builder
         * 
         */
        public Builder policyType(String policyType) {
            return policyType(Output.of(policyType));
        }

        /**
         * @param userName Filter the results by a specific the user name.
         * 
         * @return builder
         * 
         */
        public Builder userName(@Nullable Output<String> userName) {
            $.userName = userName;
            return this;
        }

        /**
         * @param userName Filter the results by a specific the user name.
         * 
         * @return builder
         * 
         */
        public Builder userName(String userName) {
            return userName(Output.of(userName));
        }

        public GetGroupsArgs build() {
            return $;
        }
    }

}
