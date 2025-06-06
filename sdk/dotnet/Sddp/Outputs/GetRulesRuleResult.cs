// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Sddp.Outputs
{

    [OutputType]
    public sealed class GetRulesRuleResult
    {
        /// <summary>
        /// Sensitive Data Identification Rules for the Type of. Valid values:
        /// </summary>
        public readonly int Category;
        /// <summary>
        /// Sensitive Data Identification Rules Belongs Type Name.
        /// </summary>
        public readonly string CategoryName;
        /// <summary>
        /// Sensitive Data Identification Rules the Content.
        /// </summary>
        public readonly string Content;
        /// <summary>
        /// The Content Classification.
        /// </summary>
        public readonly string ContentCategory;
        /// <summary>
        /// Sensitive Data Identification Rules the Creation Time of the Number of Milliseconds.
        /// </summary>
        public readonly string CreateTime;
        /// <summary>
        /// Sensitive Data Identification Rules of Type. Valid values:
        /// </summary>
        public readonly int CustomType;
        /// <summary>
        /// Sensitive Data Identification a Description of the Rule Information.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Sensitive Data Identification Rules, Founder of Account Display Name.
        /// </summary>
        public readonly string DisplayName;
        /// <summary>
        /// Sensitive Data Identification Rules to the Modified Time of the Number of Milliseconds.
        /// </summary>
        public readonly string GmtModified;
        /// <summary>
        /// The ID of the Rule.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Sensitive Data Identification Rules, Founder Of Account Login.
        /// </summary>
        public readonly string LoginName;
        /// <summary>
        /// The Primary Key.
        /// </summary>
        public readonly string MajorKey;
        /// <summary>
        /// The name of rule.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Product Code.
        /// </summary>
        public readonly string ProductCode;
        /// <summary>
        /// Product ID. Valid values:
        /// </summary>
        public readonly string ProductId;
        /// <summary>
        /// Sensitive Data Identification Rules of Risk Level ID. Valid values:
        /// </summary>
        public readonly string RiskLevelId;
        /// <summary>
        /// Sensitive Data Identification Rules the Risk Level of. S1: Weak Risk Level S2: Moderate Risk Level S3: High Risk Level S4: the Highest Risk Level.
        /// </summary>
        public readonly string RiskLevelName;
        /// <summary>
        /// The first ID of the resource.
        /// </summary>
        public readonly string RuleId;
        /// <summary>
        /// Triggered the Alarm Conditions.
        /// </summary>
        public readonly string StatExpress;
        /// <summary>
        /// Sensitive Data Identification Rules Detection State of.
        /// </summary>
        public readonly int Status;
        /// <summary>
        /// The Target.
        /// </summary>
        public readonly string Target;
        /// <summary>
        /// The User ID.
        /// </summary>
        public readonly string UserId;
        /// <summary>
        /// The Level of Risk. Valid values:
        /// </summary>
        public readonly int WarnLevel;

        [OutputConstructor]
        private GetRulesRuleResult(
            int category,

            string categoryName,

            string content,

            string contentCategory,

            string createTime,

            int customType,

            string description,

            string displayName,

            string gmtModified,

            string id,

            string loginName,

            string majorKey,

            string name,

            string productCode,

            string productId,

            string riskLevelId,

            string riskLevelName,

            string ruleId,

            string statExpress,

            int status,

            string target,

            string userId,

            int warnLevel)
        {
            Category = category;
            CategoryName = categoryName;
            Content = content;
            ContentCategory = contentCategory;
            CreateTime = createTime;
            CustomType = customType;
            Description = description;
            DisplayName = displayName;
            GmtModified = gmtModified;
            Id = id;
            LoginName = loginName;
            MajorKey = majorKey;
            Name = name;
            ProductCode = productCode;
            ProductId = productId;
            RiskLevelId = riskLevelId;
            RiskLevelName = riskLevelName;
            RuleId = ruleId;
            StatExpress = statExpress;
            Status = status;
            Target = target;
            UserId = userId;
            WarnLevel = warnLevel;
        }
    }
}
