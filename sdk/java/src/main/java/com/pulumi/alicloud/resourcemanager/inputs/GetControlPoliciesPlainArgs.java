// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.resourcemanager.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetControlPoliciesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetControlPoliciesPlainArgs Empty = new GetControlPoliciesPlainArgs();

    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     * 
     */
    @Import(name="enableDetails")
    private @Nullable Boolean enableDetails;

    /**
     * @return Default to `false`. Set it to `true` can output more details about resource attributes.
     * 
     */
    public Optional<Boolean> enableDetails() {
        return Optional.ofNullable(this.enableDetails);
    }

    /**
     * A list of Control Policy IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Control Policy IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * The language. Valid value `zh-CN`, `en`, and `ja`. Default value `zh-CN`.
     * 
     */
    @Import(name="language")
    private @Nullable String language;

    /**
     * @return The language. Valid value `zh-CN`, `en`, and `ja`. Default value `zh-CN`.
     * 
     */
    public Optional<String> language() {
        return Optional.ofNullable(this.language);
    }

    /**
     * A regex string to filter results by Control Policy name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by Control Policy name.
     * 
     */
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    /**
     * File name where to save data source results (after running `pulumi preview`).
     * 
     */
    @Import(name="outputFile")
    private @Nullable String outputFile;

    /**
     * @return File name where to save data source results (after running `pulumi preview`).
     * 
     */
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The policy type of control policy. Valid values `System` and `Custom`.
     * 
     */
    @Import(name="policyType")
    private @Nullable String policyType;

    /**
     * @return The policy type of control policy. Valid values `System` and `Custom`.
     * 
     */
    public Optional<String> policyType() {
        return Optional.ofNullable(this.policyType);
    }

    private GetControlPoliciesPlainArgs() {}

    private GetControlPoliciesPlainArgs(GetControlPoliciesPlainArgs $) {
        this.enableDetails = $.enableDetails;
        this.ids = $.ids;
        this.language = $.language;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.policyType = $.policyType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetControlPoliciesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetControlPoliciesPlainArgs $;

        public Builder() {
            $ = new GetControlPoliciesPlainArgs();
        }

        public Builder(GetControlPoliciesPlainArgs defaults) {
            $ = new GetControlPoliciesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableDetails Default to `false`. Set it to `true` can output more details about resource attributes.
         * 
         * @return builder
         * 
         */
        public Builder enableDetails(@Nullable Boolean enableDetails) {
            $.enableDetails = enableDetails;
            return this;
        }

        /**
         * @param ids A list of Control Policy IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Control Policy IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param language The language. Valid value `zh-CN`, `en`, and `ja`. Default value `zh-CN`.
         * 
         * @return builder
         * 
         */
        public Builder language(@Nullable String language) {
            $.language = language;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by Control Policy name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable String nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param policyType The policy type of control policy. Valid values `System` and `Custom`.
         * 
         * @return builder
         * 
         */
        public Builder policyType(@Nullable String policyType) {
            $.policyType = policyType;
            return this;
        }

        public GetControlPoliciesPlainArgs build() {
            return $;
        }
    }

}