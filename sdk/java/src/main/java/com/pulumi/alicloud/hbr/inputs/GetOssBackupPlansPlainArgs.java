// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.hbr.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetOssBackupPlansPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOssBackupPlansPlainArgs Empty = new GetOssBackupPlansPlainArgs();

    /**
     * The name of OSS bucket.
     * 
     */
    @Import(name="bucket")
    private @Nullable String bucket;

    /**
     * @return The name of OSS bucket.
     * 
     */
    public Optional<String> bucket() {
        return Optional.ofNullable(this.bucket);
    }

    /**
     * A list of OssBackupPlan IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of OssBackupPlan IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to filter results by OssBackupPlan name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by OssBackupPlan name.
     * 
     */
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    @Import(name="outputFile")
    private @Nullable String outputFile;

    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The ID of backup vault.
     * 
     */
    @Import(name="vaultId")
    private @Nullable String vaultId;

    /**
     * @return The ID of backup vault.
     * 
     */
    public Optional<String> vaultId() {
        return Optional.ofNullable(this.vaultId);
    }

    private GetOssBackupPlansPlainArgs() {}

    private GetOssBackupPlansPlainArgs(GetOssBackupPlansPlainArgs $) {
        this.bucket = $.bucket;
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.vaultId = $.vaultId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOssBackupPlansPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOssBackupPlansPlainArgs $;

        public Builder() {
            $ = new GetOssBackupPlansPlainArgs();
        }

        public Builder(GetOssBackupPlansPlainArgs defaults) {
            $ = new GetOssBackupPlansPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket The name of OSS bucket.
         * 
         * @return builder
         * 
         */
        public Builder bucket(@Nullable String bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param ids A list of OssBackupPlan IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of OssBackupPlan IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string to filter results by OssBackupPlan name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable String nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param vaultId The ID of backup vault.
         * 
         * @return builder
         * 
         */
        public Builder vaultId(@Nullable String vaultId) {
            $.vaultId = vaultId;
            return this;
        }

        public GetOssBackupPlansPlainArgs build() {
            return $;
        }
    }

}