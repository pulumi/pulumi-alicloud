// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.actiontrail.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTrailsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTrailsArgs Empty = new GetTrailsArgs();

    /**
     * A list of ActionTrail Trail IDs. It is the same as trail name.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of ActionTrail Trail IDs. It is the same as trail name.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * Whether to show organization tracking. Default to `false`.
     * 
     */
    @Import(name="includeOrganizationTrail")
    private @Nullable Output<Boolean> includeOrganizationTrail;

    /**
     * @return Whether to show organization tracking. Default to `false`.
     * 
     */
    public Optional<Output<Boolean>> includeOrganizationTrail() {
        return Optional.ofNullable(this.includeOrganizationTrail);
    }

    /**
     * Whether to show shadow tracking. Default to `false`.
     * 
     */
    @Import(name="includeShadowTrails")
    private @Nullable Output<Boolean> includeShadowTrails;

    /**
     * @return Whether to show shadow tracking. Default to `false`.
     * 
     */
    public Optional<Output<Boolean>> includeShadowTrails() {
        return Optional.ofNullable(this.includeShadowTrails);
    }

    /**
     * A regex string to filter results by trail name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable Output<String> nameRegex;

    /**
     * @return A regex string to filter results by trail name.
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
     * Filter the results by status of the ActionTrail Trail. Valid values: `Disable`, `Enable`, `Fresh`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Filter the results by status of the ActionTrail Trail. Valid values: `Disable`, `Enable`, `Fresh`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private GetTrailsArgs() {}

    private GetTrailsArgs(GetTrailsArgs $) {
        this.ids = $.ids;
        this.includeOrganizationTrail = $.includeOrganizationTrail;
        this.includeShadowTrails = $.includeShadowTrails;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTrailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTrailsArgs $;

        public Builder() {
            $ = new GetTrailsArgs();
        }

        public Builder(GetTrailsArgs defaults) {
            $ = new GetTrailsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of ActionTrail Trail IDs. It is the same as trail name.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of ActionTrail Trail IDs. It is the same as trail name.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of ActionTrail Trail IDs. It is the same as trail name.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param includeOrganizationTrail Whether to show organization tracking. Default to `false`.
         * 
         * @return builder
         * 
         */
        public Builder includeOrganizationTrail(@Nullable Output<Boolean> includeOrganizationTrail) {
            $.includeOrganizationTrail = includeOrganizationTrail;
            return this;
        }

        /**
         * @param includeOrganizationTrail Whether to show organization tracking. Default to `false`.
         * 
         * @return builder
         * 
         */
        public Builder includeOrganizationTrail(Boolean includeOrganizationTrail) {
            return includeOrganizationTrail(Output.of(includeOrganizationTrail));
        }

        /**
         * @param includeShadowTrails Whether to show shadow tracking. Default to `false`.
         * 
         * @return builder
         * 
         */
        public Builder includeShadowTrails(@Nullable Output<Boolean> includeShadowTrails) {
            $.includeShadowTrails = includeShadowTrails;
            return this;
        }

        /**
         * @param includeShadowTrails Whether to show shadow tracking. Default to `false`.
         * 
         * @return builder
         * 
         */
        public Builder includeShadowTrails(Boolean includeShadowTrails) {
            return includeShadowTrails(Output.of(includeShadowTrails));
        }

        /**
         * @param nameRegex A regex string to filter results by trail name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable Output<String> nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by trail name.
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
         * @param status Filter the results by status of the ActionTrail Trail. Valid values: `Disable`, `Enable`, `Fresh`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Filter the results by status of the ActionTrail Trail. Valid values: `Disable`, `Enable`, `Fresh`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public GetTrailsArgs build() {
            return $;
        }
    }

}
