// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ram.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRolesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRolesPlainArgs Empty = new GetRolesPlainArgs();

    /**
     * A list of ram role IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of ram role IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to filter results by the role name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by the role name.
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
     * Filter results by a specific policy name. If you set this parameter without setting `policy_type`, the later will be automatically set to `System`. The resulting roles will be attached to the specified policy.
     * 
     */
    @Import(name="policyName")
    private @Nullable String policyName;

    /**
     * @return Filter results by a specific policy name. If you set this parameter without setting `policy_type`, the later will be automatically set to `System`. The resulting roles will be attached to the specified policy.
     * 
     */
    public Optional<String> policyName() {
        return Optional.ofNullable(this.policyName);
    }

    /**
     * Filter results by a specific policy type. Valid values are `Custom` and `System`. If you set this parameter, you must set `policy_name` as well.
     * 
     */
    @Import(name="policyType")
    private @Nullable String policyType;

    /**
     * @return Filter results by a specific policy type. Valid values are `Custom` and `System`. If you set this parameter, you must set `policy_name` as well.
     * 
     */
    public Optional<String> policyType() {
        return Optional.ofNullable(this.policyType);
    }

    private GetRolesPlainArgs() {}

    private GetRolesPlainArgs(GetRolesPlainArgs $) {
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.policyName = $.policyName;
        this.policyType = $.policyType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRolesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRolesPlainArgs $;

        public Builder() {
            $ = new GetRolesPlainArgs();
        }

        public Builder(GetRolesPlainArgs defaults) {
            $ = new GetRolesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of ram role IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of ram role IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string to filter results by the role name.
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
         * @param policyName Filter results by a specific policy name. If you set this parameter without setting `policy_type`, the later will be automatically set to `System`. The resulting roles will be attached to the specified policy.
         * 
         * @return builder
         * 
         */
        public Builder policyName(@Nullable String policyName) {
            $.policyName = policyName;
            return this;
        }

        /**
         * @param policyType Filter results by a specific policy type. Valid values are `Custom` and `System`. If you set this parameter, you must set `policy_name` as well.
         * 
         * @return builder
         * 
         */
        public Builder policyType(@Nullable String policyType) {
            $.policyType = policyType;
            return this;
        }

        public GetRolesPlainArgs build() {
            return $;
        }
    }

}
