// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.oos;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PatchBaselineArgs extends com.pulumi.resources.ResourceArgs {

    public static final PatchBaselineArgs Empty = new PatchBaselineArgs();

    /**
     * Accept the rules. This value follows the json format. For more details, see the description of [ApprovalRules in the Request parameters table for details](https://www.alibabacloud.com/help/zh/operation-orchestration-service/latest/api-oos-2019-06-01-createpatchbaseline).
     * 
     */
    @Import(name="approvalRules", required=true)
    private Output<String> approvalRules;

    /**
     * @return Accept the rules. This value follows the json format. For more details, see the description of [ApprovalRules in the Request parameters table for details](https://www.alibabacloud.com/help/zh/operation-orchestration-service/latest/api-oos-2019-06-01-createpatchbaseline).
     * 
     */
    public Output<String> approvalRules() {
        return this.approvalRules;
    }

    /**
     * Approved Patch.
     * 
     */
    @Import(name="approvedPatches")
    private @Nullable Output<List<String>> approvedPatches;

    /**
     * @return Approved Patch.
     * 
     */
    public Optional<Output<List<String>>> approvedPatches() {
        return Optional.ofNullable(this.approvedPatches);
    }

    /**
     * ApprovedPatchesEnableNonSecurity.
     * 
     */
    @Import(name="approvedPatchesEnableNonSecurity")
    private @Nullable Output<Boolean> approvedPatchesEnableNonSecurity;

    /**
     * @return ApprovedPatchesEnableNonSecurity.
     * 
     */
    public Optional<Output<Boolean>> approvedPatchesEnableNonSecurity() {
        return Optional.ofNullable(this.approvedPatchesEnableNonSecurity);
    }

    /**
     * Patches baseline description information.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Patches baseline description information.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Operating system type. Valid values: `AliyunLinux`, `Anolis`, `CentOS`, `Debian`, `RedhatEnterpriseLinux`, `Ubuntu`, `Windows`, `AlmaLinux`.
     * 
     */
    @Import(name="operationSystem", required=true)
    private Output<String> operationSystem;

    /**
     * @return Operating system type. Valid values: `AliyunLinux`, `Anolis`, `CentOS`, `Debian`, `RedhatEnterpriseLinux`, `Ubuntu`, `Windows`, `AlmaLinux`.
     * 
     */
    public Output<String> operationSystem() {
        return this.operationSystem;
    }

    /**
     * The name of the patch baseline.
     * 
     */
    @Import(name="patchBaselineName", required=true)
    private Output<String> patchBaselineName;

    /**
     * @return The name of the patch baseline.
     * 
     */
    public Output<String> patchBaselineName() {
        return this.patchBaselineName;
    }

    /**
     * Reject patches.
     * 
     */
    @Import(name="rejectedPatches")
    private @Nullable Output<List<String>> rejectedPatches;

    /**
     * @return Reject patches.
     * 
     */
    public Optional<Output<List<String>>> rejectedPatches() {
        return Optional.ofNullable(this.rejectedPatches);
    }

    /**
     * Rejected patches action. Valid values: `ALLOW_AS_DEPENDENCY`, `BLOCK`.
     * 
     */
    @Import(name="rejectedPatchesAction")
    private @Nullable Output<String> rejectedPatchesAction;

    /**
     * @return Rejected patches action. Valid values: `ALLOW_AS_DEPENDENCY`, `BLOCK`.
     * 
     */
    public Optional<Output<String>> rejectedPatchesAction() {
        return Optional.ofNullable(this.rejectedPatchesAction);
    }

    /**
     * The ID of the resource group.
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable Output<String> resourceGroupId;

    /**
     * @return The ID of the resource group.
     * 
     */
    public Optional<Output<String>> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    /**
     * Source.
     * 
     */
    @Import(name="sources")
    private @Nullable Output<List<String>> sources;

    /**
     * @return Source.
     * 
     */
    public Optional<Output<List<String>>> sources() {
        return Optional.ofNullable(this.sources);
    }

    /**
     * Label.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Label.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private PatchBaselineArgs() {}

    private PatchBaselineArgs(PatchBaselineArgs $) {
        this.approvalRules = $.approvalRules;
        this.approvedPatches = $.approvedPatches;
        this.approvedPatchesEnableNonSecurity = $.approvedPatchesEnableNonSecurity;
        this.description = $.description;
        this.operationSystem = $.operationSystem;
        this.patchBaselineName = $.patchBaselineName;
        this.rejectedPatches = $.rejectedPatches;
        this.rejectedPatchesAction = $.rejectedPatchesAction;
        this.resourceGroupId = $.resourceGroupId;
        this.sources = $.sources;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PatchBaselineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PatchBaselineArgs $;

        public Builder() {
            $ = new PatchBaselineArgs();
        }

        public Builder(PatchBaselineArgs defaults) {
            $ = new PatchBaselineArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param approvalRules Accept the rules. This value follows the json format. For more details, see the description of [ApprovalRules in the Request parameters table for details](https://www.alibabacloud.com/help/zh/operation-orchestration-service/latest/api-oos-2019-06-01-createpatchbaseline).
         * 
         * @return builder
         * 
         */
        public Builder approvalRules(Output<String> approvalRules) {
            $.approvalRules = approvalRules;
            return this;
        }

        /**
         * @param approvalRules Accept the rules. This value follows the json format. For more details, see the description of [ApprovalRules in the Request parameters table for details](https://www.alibabacloud.com/help/zh/operation-orchestration-service/latest/api-oos-2019-06-01-createpatchbaseline).
         * 
         * @return builder
         * 
         */
        public Builder approvalRules(String approvalRules) {
            return approvalRules(Output.of(approvalRules));
        }

        /**
         * @param approvedPatches Approved Patch.
         * 
         * @return builder
         * 
         */
        public Builder approvedPatches(@Nullable Output<List<String>> approvedPatches) {
            $.approvedPatches = approvedPatches;
            return this;
        }

        /**
         * @param approvedPatches Approved Patch.
         * 
         * @return builder
         * 
         */
        public Builder approvedPatches(List<String> approvedPatches) {
            return approvedPatches(Output.of(approvedPatches));
        }

        /**
         * @param approvedPatches Approved Patch.
         * 
         * @return builder
         * 
         */
        public Builder approvedPatches(String... approvedPatches) {
            return approvedPatches(List.of(approvedPatches));
        }

        /**
         * @param approvedPatchesEnableNonSecurity ApprovedPatchesEnableNonSecurity.
         * 
         * @return builder
         * 
         */
        public Builder approvedPatchesEnableNonSecurity(@Nullable Output<Boolean> approvedPatchesEnableNonSecurity) {
            $.approvedPatchesEnableNonSecurity = approvedPatchesEnableNonSecurity;
            return this;
        }

        /**
         * @param approvedPatchesEnableNonSecurity ApprovedPatchesEnableNonSecurity.
         * 
         * @return builder
         * 
         */
        public Builder approvedPatchesEnableNonSecurity(Boolean approvedPatchesEnableNonSecurity) {
            return approvedPatchesEnableNonSecurity(Output.of(approvedPatchesEnableNonSecurity));
        }

        /**
         * @param description Patches baseline description information.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Patches baseline description information.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param operationSystem Operating system type. Valid values: `AliyunLinux`, `Anolis`, `CentOS`, `Debian`, `RedhatEnterpriseLinux`, `Ubuntu`, `Windows`, `AlmaLinux`.
         * 
         * @return builder
         * 
         */
        public Builder operationSystem(Output<String> operationSystem) {
            $.operationSystem = operationSystem;
            return this;
        }

        /**
         * @param operationSystem Operating system type. Valid values: `AliyunLinux`, `Anolis`, `CentOS`, `Debian`, `RedhatEnterpriseLinux`, `Ubuntu`, `Windows`, `AlmaLinux`.
         * 
         * @return builder
         * 
         */
        public Builder operationSystem(String operationSystem) {
            return operationSystem(Output.of(operationSystem));
        }

        /**
         * @param patchBaselineName The name of the patch baseline.
         * 
         * @return builder
         * 
         */
        public Builder patchBaselineName(Output<String> patchBaselineName) {
            $.patchBaselineName = patchBaselineName;
            return this;
        }

        /**
         * @param patchBaselineName The name of the patch baseline.
         * 
         * @return builder
         * 
         */
        public Builder patchBaselineName(String patchBaselineName) {
            return patchBaselineName(Output.of(patchBaselineName));
        }

        /**
         * @param rejectedPatches Reject patches.
         * 
         * @return builder
         * 
         */
        public Builder rejectedPatches(@Nullable Output<List<String>> rejectedPatches) {
            $.rejectedPatches = rejectedPatches;
            return this;
        }

        /**
         * @param rejectedPatches Reject patches.
         * 
         * @return builder
         * 
         */
        public Builder rejectedPatches(List<String> rejectedPatches) {
            return rejectedPatches(Output.of(rejectedPatches));
        }

        /**
         * @param rejectedPatches Reject patches.
         * 
         * @return builder
         * 
         */
        public Builder rejectedPatches(String... rejectedPatches) {
            return rejectedPatches(List.of(rejectedPatches));
        }

        /**
         * @param rejectedPatchesAction Rejected patches action. Valid values: `ALLOW_AS_DEPENDENCY`, `BLOCK`.
         * 
         * @return builder
         * 
         */
        public Builder rejectedPatchesAction(@Nullable Output<String> rejectedPatchesAction) {
            $.rejectedPatchesAction = rejectedPatchesAction;
            return this;
        }

        /**
         * @param rejectedPatchesAction Rejected patches action. Valid values: `ALLOW_AS_DEPENDENCY`, `BLOCK`.
         * 
         * @return builder
         * 
         */
        public Builder rejectedPatchesAction(String rejectedPatchesAction) {
            return rejectedPatchesAction(Output.of(rejectedPatchesAction));
        }

        /**
         * @param resourceGroupId The ID of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable Output<String> resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param resourceGroupId The ID of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(String resourceGroupId) {
            return resourceGroupId(Output.of(resourceGroupId));
        }

        /**
         * @param sources Source.
         * 
         * @return builder
         * 
         */
        public Builder sources(@Nullable Output<List<String>> sources) {
            $.sources = sources;
            return this;
        }

        /**
         * @param sources Source.
         * 
         * @return builder
         * 
         */
        public Builder sources(List<String> sources) {
            return sources(Output.of(sources));
        }

        /**
         * @param sources Source.
         * 
         * @return builder
         * 
         */
        public Builder sources(String... sources) {
            return sources(List.of(sources));
        }

        /**
         * @param tags Label.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Label.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public PatchBaselineArgs build() {
            if ($.approvalRules == null) {
                throw new MissingRequiredPropertyException("PatchBaselineArgs", "approvalRules");
            }
            if ($.operationSystem == null) {
                throw new MissingRequiredPropertyException("PatchBaselineArgs", "operationSystem");
            }
            if ($.patchBaselineName == null) {
                throw new MissingRequiredPropertyException("PatchBaselineArgs", "patchBaselineName");
            }
            return $;
        }
    }

}
