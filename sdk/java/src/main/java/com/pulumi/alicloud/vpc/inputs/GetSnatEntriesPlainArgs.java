// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSnatEntriesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSnatEntriesPlainArgs Empty = new GetSnatEntriesPlainArgs();

    /**
     * A list of Snat Entries IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Snat Entries IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to filter results by the resource name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by the resource name.
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
     * The name of snat entry.
     * 
     */
    @Import(name="snatEntryName")
    private @Nullable String snatEntryName;

    /**
     * @return The name of snat entry.
     * 
     */
    public Optional<String> snatEntryName() {
        return Optional.ofNullable(this.snatEntryName);
    }

    /**
     * The public IP of the Snat Entry.
     * 
     */
    @Import(name="snatIp")
    private @Nullable String snatIp;

    /**
     * @return The public IP of the Snat Entry.
     * 
     */
    public Optional<String> snatIp() {
        return Optional.ofNullable(this.snatIp);
    }

    /**
     * The ID of the Snat table.
     * 
     */
    @Import(name="snatTableId", required=true)
    private String snatTableId;

    /**
     * @return The ID of the Snat table.
     * 
     */
    public String snatTableId() {
        return this.snatTableId;
    }

    /**
     * The source CIDR block of the Snat Entry.
     * 
     */
    @Import(name="sourceCidr")
    private @Nullable String sourceCidr;

    /**
     * @return The source CIDR block of the Snat Entry.
     * 
     */
    public Optional<String> sourceCidr() {
        return Optional.ofNullable(this.sourceCidr);
    }

    /**
     * The source vswitch ID.
     * 
     */
    @Import(name="sourceVswitchId")
    private @Nullable String sourceVswitchId;

    /**
     * @return The source vswitch ID.
     * 
     */
    public Optional<String> sourceVswitchId() {
        return Optional.ofNullable(this.sourceVswitchId);
    }

    /**
     * The status of the Snat Entry. Valid values: `Available`, `Deleting` and `Pending`.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return The status of the Snat Entry. Valid values: `Available`, `Deleting` and `Pending`.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    private GetSnatEntriesPlainArgs() {}

    private GetSnatEntriesPlainArgs(GetSnatEntriesPlainArgs $) {
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.snatEntryName = $.snatEntryName;
        this.snatIp = $.snatIp;
        this.snatTableId = $.snatTableId;
        this.sourceCidr = $.sourceCidr;
        this.sourceVswitchId = $.sourceVswitchId;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSnatEntriesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSnatEntriesPlainArgs $;

        public Builder() {
            $ = new GetSnatEntriesPlainArgs();
        }

        public Builder(GetSnatEntriesPlainArgs defaults) {
            $ = new GetSnatEntriesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of Snat Entries IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Snat Entries IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string to filter results by the resource name.
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
         * @param snatEntryName The name of snat entry.
         * 
         * @return builder
         * 
         */
        public Builder snatEntryName(@Nullable String snatEntryName) {
            $.snatEntryName = snatEntryName;
            return this;
        }

        /**
         * @param snatIp The public IP of the Snat Entry.
         * 
         * @return builder
         * 
         */
        public Builder snatIp(@Nullable String snatIp) {
            $.snatIp = snatIp;
            return this;
        }

        /**
         * @param snatTableId The ID of the Snat table.
         * 
         * @return builder
         * 
         */
        public Builder snatTableId(String snatTableId) {
            $.snatTableId = snatTableId;
            return this;
        }

        /**
         * @param sourceCidr The source CIDR block of the Snat Entry.
         * 
         * @return builder
         * 
         */
        public Builder sourceCidr(@Nullable String sourceCidr) {
            $.sourceCidr = sourceCidr;
            return this;
        }

        /**
         * @param sourceVswitchId The source vswitch ID.
         * 
         * @return builder
         * 
         */
        public Builder sourceVswitchId(@Nullable String sourceVswitchId) {
            $.sourceVswitchId = sourceVswitchId;
            return this;
        }

        /**
         * @param status The status of the Snat Entry. Valid values: `Available`, `Deleting` and `Pending`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        public GetSnatEntriesPlainArgs build() {
            if ($.snatTableId == null) {
                throw new MissingRequiredPropertyException("GetSnatEntriesPlainArgs", "snatTableId");
            }
            return $;
        }
    }

}