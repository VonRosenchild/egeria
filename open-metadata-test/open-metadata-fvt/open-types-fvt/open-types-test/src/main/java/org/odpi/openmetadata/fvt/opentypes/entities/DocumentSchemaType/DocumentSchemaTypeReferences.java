/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */

// This is a generated file - do not edit - changes should be made to the templates amd/or generator to generate this file with changes.

package org.odpi.openmetadata.fvt.opentypes.entities.DocumentSchemaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.odpi.openmetadata.repositoryservices.connectors.stores.metadatacollectionstore.properties.instances.Relationship;

import  org.odpi.openmetadata.fvt.opentypes.references.ComplexSchemaTypeToSchemaAttribute.AttributesReference;
import org.odpi.openmetadata.fvt.opentypes.relationships.AttributeForSchema.AttributeForSchema;
import org.odpi.openmetadata.fvt.opentypes.relationships.AttributeForSchema.AttributeForSchemaMapper;
import  org.odpi.openmetadata.fvt.opentypes.references.SchemaTypeToSchemaAnalysisAnnotation.DeployedSchemaTypesReference;
import org.odpi.openmetadata.fvt.opentypes.relationships.SchemaTypeDefinition.SchemaTypeDefinition;
import org.odpi.openmetadata.fvt.opentypes.relationships.SchemaTypeDefinition.SchemaTypeDefinitionMapper;
import  org.odpi.openmetadata.fvt.opentypes.references.SchemaTypeToImplementationSnippet.ImplementationSnippetsReference;
import org.odpi.openmetadata.fvt.opentypes.relationships.SchemaTypeImplementation.SchemaTypeImplementation;
import org.odpi.openmetadata.fvt.opentypes.relationships.SchemaTypeImplementation.SchemaTypeImplementationMapper;
import  org.odpi.openmetadata.fvt.opentypes.references.SchemaTypeToMapSchemaType.ParentMapToReference;
import org.odpi.openmetadata.fvt.opentypes.relationships.MapToElementType.MapToElementType;
import org.odpi.openmetadata.fvt.opentypes.relationships.MapToElementType.MapToElementTypeMapper;
import  org.odpi.openmetadata.fvt.opentypes.references.SchemaTypeToAPIOperation.UsedAsAPIRequestReference;
import org.odpi.openmetadata.fvt.opentypes.relationships.APIRequest.APIRequest;
import org.odpi.openmetadata.fvt.opentypes.relationships.APIRequest.APIRequestMapper;
import  org.odpi.openmetadata.fvt.opentypes.references.SchemaTypeToSchemaAttribute.UsedInSchemasReference;
import org.odpi.openmetadata.fvt.opentypes.relationships.SchemaAttributeType.SchemaAttributeType;
import org.odpi.openmetadata.fvt.opentypes.relationships.SchemaAttributeType.SchemaAttributeTypeMapper;
import  org.odpi.openmetadata.fvt.opentypes.references.SchemaTypeToMapSchemaType.ParentMapFromReference;
import org.odpi.openmetadata.fvt.opentypes.relationships.MapFromElementType.MapFromElementType;
import org.odpi.openmetadata.fvt.opentypes.relationships.MapFromElementType.MapFromElementTypeMapper;
import  org.odpi.openmetadata.fvt.opentypes.references.SchemaTypeToSchemaLinkElement.LinkedByReference;
import org.odpi.openmetadata.fvt.opentypes.relationships.LinkedType.LinkedType;
import org.odpi.openmetadata.fvt.opentypes.relationships.LinkedType.LinkedTypeMapper;
import  org.odpi.openmetadata.fvt.opentypes.references.SchemaTypeToAPIOperation.UsedAsAPIHeaderReference;
import org.odpi.openmetadata.fvt.opentypes.relationships.APIHeader.APIHeader;
import org.odpi.openmetadata.fvt.opentypes.relationships.APIHeader.APIHeaderMapper;
import  org.odpi.openmetadata.fvt.opentypes.references.SchemaTypeToAPIOperation.UsedAsAPIResponseReference;
import org.odpi.openmetadata.fvt.opentypes.relationships.APIResponse.APIResponse;
import org.odpi.openmetadata.fvt.opentypes.relationships.APIResponse.APIResponseMapper;
import  org.odpi.openmetadata.fvt.opentypes.references.SchemaTypeToAsset.DescribesAssetsReference;
import org.odpi.openmetadata.fvt.opentypes.relationships.AssetSchemaType.AssetSchemaType;
import org.odpi.openmetadata.fvt.opentypes.relationships.AssetSchemaType.AssetSchemaTypeMapper;
import  org.odpi.openmetadata.fvt.opentypes.references.ReferenceableToRelatedMedia.RelatedMediaReference;
import org.odpi.openmetadata.fvt.opentypes.relationships.MediaReference.MediaReference;
import org.odpi.openmetadata.fvt.opentypes.relationships.MediaReference.MediaReferenceMapper;
import  org.odpi.openmetadata.fvt.opentypes.references.ReferenceableToToDo.ActionsReference;
import org.odpi.openmetadata.fvt.opentypes.relationships.ToDoSource.ToDoSource;
import org.odpi.openmetadata.fvt.opentypes.relationships.ToDoSource.ToDoSourceMapper;
import  org.odpi.openmetadata.fvt.opentypes.references.ReferenceableToGlossaryTerm.MeaningReference;
import org.odpi.openmetadata.fvt.opentypes.relationships.SemanticAssignment.SemanticAssignment;
import org.odpi.openmetadata.fvt.opentypes.relationships.SemanticAssignment.SemanticAssignmentMapper;
import  org.odpi.openmetadata.fvt.opentypes.references.ReferenceableToRating.StarRatingsReference;
import org.odpi.openmetadata.fvt.opentypes.relationships.AttachedRating.AttachedRating;
import org.odpi.openmetadata.fvt.opentypes.relationships.AttachedRating.AttachedRatingMapper;
import  org.odpi.openmetadata.fvt.opentypes.references.ReferenceableToPropertyFacet.FacetsReference;
import org.odpi.openmetadata.fvt.opentypes.relationships.ReferenceableFacet.ReferenceableFacet;
import org.odpi.openmetadata.fvt.opentypes.relationships.ReferenceableFacet.ReferenceableFacetMapper;
import  org.odpi.openmetadata.fvt.opentypes.references.ReferenceableToReferenceable.SupportingResourcesReference;
import org.odpi.openmetadata.fvt.opentypes.relationships.ResourceList.ResourceList;
import org.odpi.openmetadata.fvt.opentypes.relationships.ResourceList.ResourceListMapper;
import  org.odpi.openmetadata.fvt.opentypes.references.ReferenceableToDataClass.DataClassesAssignedToElementReference;
import org.odpi.openmetadata.fvt.opentypes.relationships.DataClassAssignment.DataClassAssignment;
import org.odpi.openmetadata.fvt.opentypes.relationships.DataClassAssignment.DataClassAssignmentMapper;
import  org.odpi.openmetadata.fvt.opentypes.references.ReferenceableToMeeting.MeetingsReference;
import org.odpi.openmetadata.fvt.opentypes.relationships.Meetings.Meetings;
import org.odpi.openmetadata.fvt.opentypes.relationships.Meetings.MeetingsMapper;
import  org.odpi.openmetadata.fvt.opentypes.references.ReferenceableToExternalId.AlsoKnownAsReference;
import org.odpi.openmetadata.fvt.opentypes.relationships.ExternalIdLink.ExternalIdLink;
import org.odpi.openmetadata.fvt.opentypes.relationships.ExternalIdLink.ExternalIdLinkMapper;
import  org.odpi.openmetadata.fvt.opentypes.references.ReferenceableToInformalTag.TagsReference;
import org.odpi.openmetadata.fvt.opentypes.relationships.AttachedTag.AttachedTag;
import org.odpi.openmetadata.fvt.opentypes.relationships.AttachedTag.AttachedTagMapper;
import  org.odpi.openmetadata.fvt.opentypes.references.ReferenceableToNoteLog.NoteLogsReference;
import org.odpi.openmetadata.fvt.opentypes.relationships.AttachedNoteLog.AttachedNoteLog;
import org.odpi.openmetadata.fvt.opentypes.relationships.AttachedNoteLog.AttachedNoteLogMapper;
import  org.odpi.openmetadata.fvt.opentypes.references.ReferenceableToCollection.FoundInCollectionsReference;
import org.odpi.openmetadata.fvt.opentypes.relationships.CollectionMembership.CollectionMembership;
import org.odpi.openmetadata.fvt.opentypes.relationships.CollectionMembership.CollectionMembershipMapper;
import  org.odpi.openmetadata.fvt.opentypes.references.ReferenceableToCertificationType.CertificationsReference;
import org.odpi.openmetadata.fvt.opentypes.relationships.Certification.Certification;
import org.odpi.openmetadata.fvt.opentypes.relationships.Certification.CertificationMapper;
import  org.odpi.openmetadata.fvt.opentypes.references.ReferenceableToToDo.RelatedActionsReference;
import org.odpi.openmetadata.fvt.opentypes.relationships.Actions.Actions;
import org.odpi.openmetadata.fvt.opentypes.relationships.Actions.ActionsMapper;
import  org.odpi.openmetadata.fvt.opentypes.references.ReferenceableToComment.CommentsReference;
import org.odpi.openmetadata.fvt.opentypes.relationships.AttachedComment.AttachedComment;
import org.odpi.openmetadata.fvt.opentypes.relationships.AttachedComment.AttachedCommentMapper;
import  org.odpi.openmetadata.fvt.opentypes.references.ReferenceableToExternalId.ManagedResourcesReference;
import org.odpi.openmetadata.fvt.opentypes.relationships.ExternalIdScope.ExternalIdScope;
import org.odpi.openmetadata.fvt.opentypes.relationships.ExternalIdScope.ExternalIdScopeMapper;
import  org.odpi.openmetadata.fvt.opentypes.references.ReferenceableToExternalReference.ExternalReferenceReference;
import org.odpi.openmetadata.fvt.opentypes.relationships.ExternalReferenceLink.ExternalReferenceLink;
import org.odpi.openmetadata.fvt.opentypes.relationships.ExternalReferenceLink.ExternalReferenceLinkMapper;
import  org.odpi.openmetadata.fvt.opentypes.references.ReferenceableToCrowdSourcingContributor.ContributorsReference;
import org.odpi.openmetadata.fvt.opentypes.relationships.CrowdSourcingContribution.CrowdSourcingContribution;
import org.odpi.openmetadata.fvt.opentypes.relationships.CrowdSourcingContribution.CrowdSourcingContributionMapper;
import  org.odpi.openmetadata.fvt.opentypes.references.ReferenceableToReferenceable.RelatedFromObjectAnnotationsReference;
import org.odpi.openmetadata.fvt.opentypes.relationships.RelationshipAnnotation.RelationshipAnnotation;
import org.odpi.openmetadata.fvt.opentypes.relationships.RelationshipAnnotation.RelationshipAnnotationMapper;
import  org.odpi.openmetadata.fvt.opentypes.references.ReferenceableToProject.ImpactingProjectsReference;
import org.odpi.openmetadata.fvt.opentypes.relationships.ProjectScope.ProjectScope;
import org.odpi.openmetadata.fvt.opentypes.relationships.ProjectScope.ProjectScopeMapper;
import  org.odpi.openmetadata.fvt.opentypes.references.ReferenceableToLicenseType.LicensesReference;
import org.odpi.openmetadata.fvt.opentypes.relationships.License.License;
import org.odpi.openmetadata.fvt.opentypes.relationships.License.LicenseMapper;
import  org.odpi.openmetadata.fvt.opentypes.references.ReferenceableToLike.LikesReference;
import org.odpi.openmetadata.fvt.opentypes.relationships.AttachedLike.AttachedLike;
import org.odpi.openmetadata.fvt.opentypes.relationships.AttachedLike.AttachedLikeMapper;
import  org.odpi.openmetadata.fvt.opentypes.references.ReferenceableToReferenceable.RelatedToObjectAnnotationsReference;
import org.odpi.openmetadata.fvt.opentypes.relationships.RelationshipAnnotation.RelationshipAnnotation;
import org.odpi.openmetadata.fvt.opentypes.relationships.RelationshipAnnotation.RelationshipAnnotationMapper;
import  org.odpi.openmetadata.fvt.opentypes.references.ReferenceableToPersonRole.GovernedByRolesReference;
import org.odpi.openmetadata.fvt.opentypes.relationships.GovernanceRoleAssignment.GovernanceRoleAssignment;
import org.odpi.openmetadata.fvt.opentypes.relationships.GovernanceRoleAssignment.GovernanceRoleAssignmentMapper;
import  org.odpi.openmetadata.fvt.opentypes.references.ReferenceableToReferenceable.ResourceListAnchorsReference;
import org.odpi.openmetadata.fvt.opentypes.relationships.ResourceList.ResourceList;
import org.odpi.openmetadata.fvt.opentypes.relationships.ResourceList.ResourceListMapper;

import java.io.Serializable;
import java.util.*;
import org.odpi.openmetadata.fvt.opentypes.common.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE;
import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;

/**
 * References for entity  DocumentSchemaType. References are relationships represented as an attribute. Exposing relationships information
 * as references can make the relationships information more digestable.
 */
@JsonAutoDetect(getterVisibility=PUBLIC_ONLY, setterVisibility=PUBLIC_ONLY, fieldVisibility=NONE)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown=true)
public class DocumentSchemaTypeReferences implements Serializable {
    private static final Logger log = LoggerFactory.getLogger(DocumentSchemaTypeReferences.class);
    private static final String className = DocumentSchemaTypeReferences.class.getName();

    public static final String[] REFERENCE_NAMES_SET_VALUES = new String[] {
             "attributes",
             "deployedSchemaTypes",
             "implementationSnippets",
             "parentMapTo",
             "usedAsAPIRequest",
             "usedInSchemas",
             "parentMapFrom",
             "linkedBy",
             "usedAsAPIHeader",
             "usedAsAPIResponse",
             "describesAssets",
             "relatedMedia",
             "actions",
             "meaning",
             "starRatings",
             "facets",
             "supportingResources",
             "dataClassesAssignedToElement",
             "meetings",
             "alsoKnownAs",
             "tags",
             "noteLogs",
             "foundInCollections",
             "certifications",
             "relatedActions",
             "comments",
             "managedResources",
             "externalReference",
             "contributors",
             "relatedFromObjectAnnotations",
             "impactingProjects",
             "licenses",
             "likes",
             "relatedToObjectAnnotations",
             "governedByRoles",
             "resourceListAnchors",
             // Terminate the list
             null
    };

     public static final String[] RELATIONSHIP_NAMES_SET_VALUES = new String[] {
             "AttributeForSchema",
             "SchemaTypeDefinition",
             "SchemaTypeImplementation",
             "MapToElementType",
             "APIRequest",
             "SchemaAttributeType",
             "MapFromElementType",
             "LinkedType",
             "APIHeader",
             "APIResponse",
             "AssetSchemaType",
             "MediaReference",
             "ToDoSource",
             "SemanticAssignment",
             "AttachedRating",
             "ReferenceableFacet",
             "ResourceList",
             "DataClassAssignment",
             "Meetings",
             "ExternalIdLink",
             "AttachedTag",
             "AttachedNoteLog",
             "CollectionMembership",
             "Certification",
             "Actions",
             "AttachedComment",
             "ExternalIdScope",
             "ExternalReferenceLink",
             "CrowdSourcingContribution",
             "RelationshipAnnotation",
             "ProjectScope",
             "License",
             "AttachedLike",
             "RelationshipAnnotation",
             "GovernanceRoleAssignment",
             "ResourceList",
              // Terminate the list
              null
     };
     /**
       * We are passed a set of omrs relationships that are associated with a entity DocumentSchemaType
       * Each of these relationships should map to a reference (a uniquely named attribute in DocumentSchemaType).
       *
       * Relationships have cardinality. There are 2 sorts of cardinality relevant here, whether the relationships can be related to one or many
       * entities.
       *
       * @param lines the relationships lines.
       * @param entityGuid The GUID of the entity.
       */
     public DocumentSchemaTypeReferences(String entityGuid, Set<Line> lines)  {

        if (lines !=null) {
         for (Line relationships: lines) {
            for (int i=0;i< RELATIONSHIP_NAMES_SET_VALUES.length; i++) {
               if (relationships.getName().equals(RELATIONSHIP_NAMES_SET_VALUES[i])) {
                    String referenceName = REFERENCE_NAMES_SET_VALUES[i];

                    if ("attributes".equals(referenceName)) {
                         AttributeForSchema attributeForSchema_relationship = (AttributeForSchema)relationships;
                         AttributesReference attributesReference = new AttributesReference(entityGuid,attributeForSchema_relationship);
                         if ( attributes== null ) {
                              attributes = new HashSet();
                         }
                          attributes.add(attributesReference);
                    }
                    if ("deployedSchemaTypes".equals(referenceName)) {
                         SchemaTypeDefinition schemaTypeDefinition_relationship = (SchemaTypeDefinition)relationships;
                         DeployedSchemaTypesReference deployedSchemaTypesReference = new DeployedSchemaTypesReference(entityGuid,schemaTypeDefinition_relationship);
                         if ( deployedSchemaTypes== null ) {
                              deployedSchemaTypes = new HashSet();
                         }
                          deployedSchemaTypes.add(deployedSchemaTypesReference);
                    }
                    if ("implementationSnippets".equals(referenceName)) {
                         SchemaTypeImplementation schemaTypeImplementation_relationship = (SchemaTypeImplementation)relationships;
                         ImplementationSnippetsReference implementationSnippetsReference = new ImplementationSnippetsReference(entityGuid,schemaTypeImplementation_relationship);
                         if ( implementationSnippets== null ) {
                              implementationSnippets = new HashSet();
                         }
                          implementationSnippets.add(implementationSnippetsReference);
                    }
                    if ("parentMapTo".equals(referenceName)) {
                         MapToElementType mapToElementType_relationship = (MapToElementType)relationships;
                         ParentMapToReference parentMapToReference = new ParentMapToReference(entityGuid,mapToElementType_relationship);
                         if ( parentMapTo== null ) {
                              parentMapTo = new HashSet();
                         }
                          parentMapTo.add(parentMapToReference);
                    }
                    if ("usedAsAPIRequest".equals(referenceName)) {
                         APIRequest aPIRequest_relationship = (APIRequest)relationships;
                         UsedAsAPIRequestReference usedAsAPIRequestReference = new UsedAsAPIRequestReference(entityGuid,aPIRequest_relationship);
                         if ( usedAsAPIRequest== null ) {
                              usedAsAPIRequest = new HashSet();
                         }
                          usedAsAPIRequest.add(usedAsAPIRequestReference);
                    }
                    if ("usedInSchemas".equals(referenceName)) {
                         SchemaAttributeType schemaAttributeType_relationship = (SchemaAttributeType)relationships;
                         UsedInSchemasReference usedInSchemasReference = new UsedInSchemasReference(entityGuid,schemaAttributeType_relationship);
                         if ( usedInSchemas== null ) {
                              usedInSchemas = new HashSet();
                         }
                          usedInSchemas.add(usedInSchemasReference);
                    }
                    if ("parentMapFrom".equals(referenceName)) {
                         MapFromElementType mapFromElementType_relationship = (MapFromElementType)relationships;
                         ParentMapFromReference parentMapFromReference = new ParentMapFromReference(entityGuid,mapFromElementType_relationship);
                         if ( parentMapFrom== null ) {
                              parentMapFrom = new HashSet();
                         }
                          parentMapFrom.add(parentMapFromReference);
                    }
                    if ("linkedBy".equals(referenceName)) {
                         LinkedType linkedType_relationship = (LinkedType)relationships;
                         LinkedByReference linkedByReference = new LinkedByReference(entityGuid,linkedType_relationship);
                         if ( linkedBy== null ) {
                              linkedBy = new HashSet();
                         }
                          linkedBy.add(linkedByReference);
                    }
                    if ("usedAsAPIHeader".equals(referenceName)) {
                         APIHeader aPIHeader_relationship = (APIHeader)relationships;
                         UsedAsAPIHeaderReference usedAsAPIHeaderReference = new UsedAsAPIHeaderReference(entityGuid,aPIHeader_relationship);
                         if ( usedAsAPIHeader== null ) {
                              usedAsAPIHeader = new HashSet();
                         }
                          usedAsAPIHeader.add(usedAsAPIHeaderReference);
                    }
                    if ("usedAsAPIResponse".equals(referenceName)) {
                         APIResponse aPIResponse_relationship = (APIResponse)relationships;
                         UsedAsAPIResponseReference usedAsAPIResponseReference = new UsedAsAPIResponseReference(entityGuid,aPIResponse_relationship);
                         if ( usedAsAPIResponse== null ) {
                              usedAsAPIResponse = new HashSet();
                         }
                          usedAsAPIResponse.add(usedAsAPIResponseReference);
                    }
                    if ("describesAssets".equals(referenceName)) {
                         AssetSchemaType assetSchemaType_relationship = (AssetSchemaType)relationships;
                         DescribesAssetsReference describesAssetsReference = new DescribesAssetsReference(entityGuid,assetSchemaType_relationship);
                         if ( describesAssets== null ) {
                              describesAssets = new HashSet();
                         }
                          describesAssets.add(describesAssetsReference);
                    }
                    if ("relatedMedia".equals(referenceName)) {
                         MediaReference mediaReference_relationship = (MediaReference)relationships;
                         RelatedMediaReference relatedMediaReference = new RelatedMediaReference(entityGuid,mediaReference_relationship);
                         if ( relatedMedia== null ) {
                              relatedMedia = new HashSet();
                         }
                          relatedMedia.add(relatedMediaReference);
                    }
                    if ("actions".equals(referenceName)) {
                         ToDoSource toDoSource_relationship = (ToDoSource)relationships;
                         ActionsReference actionsReference = new ActionsReference(entityGuid,toDoSource_relationship);
                         if ( actions== null ) {
                              actions = new HashSet();
                         }
                          actions.add(actionsReference);
                    }
                    if ("meaning".equals(referenceName)) {
                         SemanticAssignment semanticAssignment_relationship = (SemanticAssignment)relationships;
                         MeaningReference meaningReference = new MeaningReference(entityGuid,semanticAssignment_relationship);
                         if ( meaning== null ) {
                              meaning = new HashSet();
                         }
                          meaning.add(meaningReference);
                    }
                    if ("starRatings".equals(referenceName)) {
                         AttachedRating attachedRating_relationship = (AttachedRating)relationships;
                         StarRatingsReference starRatingsReference = new StarRatingsReference(entityGuid,attachedRating_relationship);
                         if ( starRatings== null ) {
                              starRatings = new HashSet();
                         }
                          starRatings.add(starRatingsReference);
                    }
                    if ("facets".equals(referenceName)) {
                         ReferenceableFacet referenceableFacet_relationship = (ReferenceableFacet)relationships;
                         FacetsReference facetsReference = new FacetsReference(entityGuid,referenceableFacet_relationship);
                         if ( facets== null ) {
                              facets = new HashSet();
                         }
                          facets.add(facetsReference);
                    }
                    if ("supportingResources".equals(referenceName)) {
                         ResourceList resourceList_relationship = (ResourceList)relationships;
                         SupportingResourcesReference supportingResourcesReference = new SupportingResourcesReference(entityGuid,resourceList_relationship);
                         if ( supportingResources== null ) {
                              supportingResources = new HashSet();
                         }
                          supportingResources.add(supportingResourcesReference);
                    }
                    if ("dataClassesAssignedToElement".equals(referenceName)) {
                         DataClassAssignment dataClassAssignment_relationship = (DataClassAssignment)relationships;
                         DataClassesAssignedToElementReference dataClassesAssignedToElementReference = new DataClassesAssignedToElementReference(entityGuid,dataClassAssignment_relationship);
                         if ( dataClassesAssignedToElement== null ) {
                              dataClassesAssignedToElement = new HashSet();
                         }
                          dataClassesAssignedToElement.add(dataClassesAssignedToElementReference);
                    }
                    if ("meetings".equals(referenceName)) {
                         Meetings meetings_relationship = (Meetings)relationships;
                         MeetingsReference meetingsReference = new MeetingsReference(entityGuid,meetings_relationship);
                         if ( meetings== null ) {
                              meetings = new HashSet();
                         }
                          meetings.add(meetingsReference);
                    }
                    if ("alsoKnownAs".equals(referenceName)) {
                         ExternalIdLink externalIdLink_relationship = (ExternalIdLink)relationships;
                         AlsoKnownAsReference alsoKnownAsReference = new AlsoKnownAsReference(entityGuid,externalIdLink_relationship);
                         if ( alsoKnownAs== null ) {
                              alsoKnownAs = new HashSet();
                         }
                          alsoKnownAs.add(alsoKnownAsReference);
                    }
                    if ("tags".equals(referenceName)) {
                         AttachedTag attachedTag_relationship = (AttachedTag)relationships;
                         TagsReference tagsReference = new TagsReference(entityGuid,attachedTag_relationship);
                         if ( tags== null ) {
                              tags = new HashSet();
                         }
                          tags.add(tagsReference);
                    }
                    if ("noteLogs".equals(referenceName)) {
                         AttachedNoteLog attachedNoteLog_relationship = (AttachedNoteLog)relationships;
                         NoteLogsReference noteLogsReference = new NoteLogsReference(entityGuid,attachedNoteLog_relationship);
                         if ( noteLogs== null ) {
                              noteLogs = new HashSet();
                         }
                          noteLogs.add(noteLogsReference);
                    }
                    if ("foundInCollections".equals(referenceName)) {
                         CollectionMembership collectionMembership_relationship = (CollectionMembership)relationships;
                         FoundInCollectionsReference foundInCollectionsReference = new FoundInCollectionsReference(entityGuid,collectionMembership_relationship);
                         if ( foundInCollections== null ) {
                              foundInCollections = new HashSet();
                         }
                          foundInCollections.add(foundInCollectionsReference);
                    }
                    if ("certifications".equals(referenceName)) {
                         Certification certification_relationship = (Certification)relationships;
                         CertificationsReference certificationsReference = new CertificationsReference(entityGuid,certification_relationship);
                         if ( certifications== null ) {
                              certifications = new HashSet();
                         }
                          certifications.add(certificationsReference);
                    }
                    if ("relatedActions".equals(referenceName)) {
                         Actions actions_relationship = (Actions)relationships;
                         RelatedActionsReference relatedActionsReference = new RelatedActionsReference(entityGuid,actions_relationship);
                         if ( relatedActions== null ) {
                              relatedActions = new HashSet();
                         }
                          relatedActions.add(relatedActionsReference);
                    }
                    if ("comments".equals(referenceName)) {
                         AttachedComment attachedComment_relationship = (AttachedComment)relationships;
                         CommentsReference commentsReference = new CommentsReference(entityGuid,attachedComment_relationship);
                         if ( comments== null ) {
                              comments = new HashSet();
                         }
                          comments.add(commentsReference);
                    }
                    if ("managedResources".equals(referenceName)) {
                         ExternalIdScope externalIdScope_relationship = (ExternalIdScope)relationships;
                         ManagedResourcesReference managedResourcesReference = new ManagedResourcesReference(entityGuid,externalIdScope_relationship);
                         if ( managedResources== null ) {
                              managedResources = new HashSet();
                         }
                          managedResources.add(managedResourcesReference);
                    }
                    if ("externalReference".equals(referenceName)) {
                         ExternalReferenceLink externalReferenceLink_relationship = (ExternalReferenceLink)relationships;
                         ExternalReferenceReference externalReferenceReference = new ExternalReferenceReference(entityGuid,externalReferenceLink_relationship);
                         if ( externalReference== null ) {
                              externalReference = new HashSet();
                         }
                          externalReference.add(externalReferenceReference);
                    }
                    if ("contributors".equals(referenceName)) {
                         CrowdSourcingContribution crowdSourcingContribution_relationship = (CrowdSourcingContribution)relationships;
                         ContributorsReference contributorsReference = new ContributorsReference(entityGuid,crowdSourcingContribution_relationship);
                         if ( contributors== null ) {
                              contributors = new HashSet();
                         }
                          contributors.add(contributorsReference);
                    }
                    if ("relatedFromObjectAnnotations".equals(referenceName)) {
                         RelationshipAnnotation relationshipAnnotation_relationship = (RelationshipAnnotation)relationships;
                         RelatedFromObjectAnnotationsReference relatedFromObjectAnnotationsReference = new RelatedFromObjectAnnotationsReference(entityGuid,relationshipAnnotation_relationship);
                         if ( relatedFromObjectAnnotations== null ) {
                              relatedFromObjectAnnotations = new HashSet();
                         }
                          relatedFromObjectAnnotations.add(relatedFromObjectAnnotationsReference);
                    }
                    if ("impactingProjects".equals(referenceName)) {
                         ProjectScope projectScope_relationship = (ProjectScope)relationships;
                         ImpactingProjectsReference impactingProjectsReference = new ImpactingProjectsReference(entityGuid,projectScope_relationship);
                         if ( impactingProjects== null ) {
                              impactingProjects = new HashSet();
                         }
                          impactingProjects.add(impactingProjectsReference);
                    }
                    if ("licenses".equals(referenceName)) {
                         License license_relationship = (License)relationships;
                         LicensesReference licensesReference = new LicensesReference(entityGuid,license_relationship);
                         if ( licenses== null ) {
                              licenses = new HashSet();
                         }
                          licenses.add(licensesReference);
                    }
                    if ("likes".equals(referenceName)) {
                         AttachedLike attachedLike_relationship = (AttachedLike)relationships;
                         LikesReference likesReference = new LikesReference(entityGuid,attachedLike_relationship);
                         if ( likes== null ) {
                              likes = new HashSet();
                         }
                          likes.add(likesReference);
                    }
                    if ("governedByRoles".equals(referenceName)) {
                         GovernanceRoleAssignment governanceRoleAssignment_relationship = (GovernanceRoleAssignment)relationships;
                         GovernedByRolesReference governedByRolesReference = new GovernedByRolesReference(entityGuid,governanceRoleAssignment_relationship);
                         if ( governedByRoles== null ) {
                              governedByRoles = new HashSet();
                         }
                          governedByRoles.add(governedByRolesReference);
                    }
                    if ("resourceListAnchors".equals(referenceName)) {
                         ResourceList resourceList_relationship = (ResourceList)relationships;
                         ResourceListAnchorsReference resourceListAnchorsReference = new ResourceListAnchorsReference(entityGuid,resourceList_relationship);
                         if ( resourceListAnchors== null ) {
                              resourceListAnchors = new HashSet();
                         }
                          resourceListAnchors.add(resourceListAnchorsReference);
                    }

                    if ("relatedToObjectAnnotations".equals(referenceName)) {
                         RelationshipAnnotation relationshipAnnotation_relationship = (RelationshipAnnotation)relationships;
                         relatedToObjectAnnotations = new RelatedToObjectAnnotationsReference(entityGuid, relationshipAnnotation_relationship);
                    }
                 }
             }
         }
        }
     }

    public static final Set<String> REFERENCE_NAMES_SET = new HashSet(new HashSet<>(Arrays.asList(REFERENCE_NAMES_SET_VALUES)));
    // there may be duplicate strings in RELATIONSHIP_NAMES_SET_VALUES, the following line deduplicates the Strings into a Set.
    public static final Set<String> RELATIONSHIP_NAMES_SET = new HashSet(new HashSet<>(Arrays.asList(RELATIONSHIP_NAMES_SET_VALUES)));
// Singular properties
    private RelatedToObjectAnnotationsReference relatedToObjectAnnotations;
// Set properties

    private Set<AttributesReference> attributes;
    private Set<DeployedSchemaTypesReference> deployedSchemaTypes;
    private Set<ImplementationSnippetsReference> implementationSnippets;
    private Set<ParentMapToReference> parentMapTo;
    private Set<UsedAsAPIRequestReference> usedAsAPIRequest;
    private Set<UsedInSchemasReference> usedInSchemas;
    private Set<ParentMapFromReference> parentMapFrom;
    private Set<LinkedByReference> linkedBy;
    private Set<UsedAsAPIHeaderReference> usedAsAPIHeader;
    private Set<UsedAsAPIResponseReference> usedAsAPIResponse;
    private Set<DescribesAssetsReference> describesAssets;
    private Set<RelatedMediaReference> relatedMedia;
    private Set<ActionsReference> actions;
    private Set<MeaningReference> meaning;
    private Set<StarRatingsReference> starRatings;
    private Set<FacetsReference> facets;
    private Set<SupportingResourcesReference> supportingResources;
    private Set<DataClassesAssignedToElementReference> dataClassesAssignedToElement;
    private Set<MeetingsReference> meetings;
    private Set<AlsoKnownAsReference> alsoKnownAs;
    private Set<TagsReference> tags;
    private Set<NoteLogsReference> noteLogs;
    private Set<FoundInCollectionsReference> foundInCollections;
    private Set<CertificationsReference> certifications;
    private Set<RelatedActionsReference> relatedActions;
    private Set<CommentsReference> comments;
    private Set<ManagedResourcesReference> managedResources;
    private Set<ExternalReferenceReference> externalReference;
    private Set<ContributorsReference> contributors;
    private Set<RelatedFromObjectAnnotationsReference> relatedFromObjectAnnotations;
    private Set<ImpactingProjectsReference> impactingProjects;
    private Set<LicensesReference> licenses;
    private Set<LikesReference> likes;
    private Set<GovernedByRolesReference> governedByRoles;
    private Set<ResourceListAnchorsReference> resourceListAnchors;

// List properties

    // setters and setters
    public RelatedToObjectAnnotationsReference getRelatedToObjectAnnotationsReference() {
        return relatedToObjectAnnotations;   }

    public void setRelatedToObjectAnnotationsReference(RelatedToObjectAnnotationsReference relatedToObjectAnnotations) {
        this.relatedToObjectAnnotations = relatedToObjectAnnotations; }

// Sets
    public Set<AttributesReference> getAttributesReferences() {
        return attributes;
    }

    public void setAttributesReferences(Set<AttributesReference> attributes) {
        this.attributes =attributes;
    }
    public Set<DeployedSchemaTypesReference> getDeployedSchemaTypesReferences() {
        return deployedSchemaTypes;
    }

    public void setDeployedSchemaTypesReferences(Set<DeployedSchemaTypesReference> deployedSchemaTypes) {
        this.deployedSchemaTypes =deployedSchemaTypes;
    }
    public Set<ImplementationSnippetsReference> getImplementationSnippetsReferences() {
        return implementationSnippets;
    }

    public void setImplementationSnippetsReferences(Set<ImplementationSnippetsReference> implementationSnippets) {
        this.implementationSnippets =implementationSnippets;
    }
    public Set<ParentMapToReference> getParentMapToReferences() {
        return parentMapTo;
    }

    public void setParentMapToReferences(Set<ParentMapToReference> parentMapTo) {
        this.parentMapTo =parentMapTo;
    }
    public Set<UsedAsAPIRequestReference> getUsedAsAPIRequestReferences() {
        return usedAsAPIRequest;
    }

    public void setUsedAsAPIRequestReferences(Set<UsedAsAPIRequestReference> usedAsAPIRequest) {
        this.usedAsAPIRequest =usedAsAPIRequest;
    }
    public Set<UsedInSchemasReference> getUsedInSchemasReferences() {
        return usedInSchemas;
    }

    public void setUsedInSchemasReferences(Set<UsedInSchemasReference> usedInSchemas) {
        this.usedInSchemas =usedInSchemas;
    }
    public Set<ParentMapFromReference> getParentMapFromReferences() {
        return parentMapFrom;
    }

    public void setParentMapFromReferences(Set<ParentMapFromReference> parentMapFrom) {
        this.parentMapFrom =parentMapFrom;
    }
    public Set<LinkedByReference> getLinkedByReferences() {
        return linkedBy;
    }

    public void setLinkedByReferences(Set<LinkedByReference> linkedBy) {
        this.linkedBy =linkedBy;
    }
    public Set<UsedAsAPIHeaderReference> getUsedAsAPIHeaderReferences() {
        return usedAsAPIHeader;
    }

    public void setUsedAsAPIHeaderReferences(Set<UsedAsAPIHeaderReference> usedAsAPIHeader) {
        this.usedAsAPIHeader =usedAsAPIHeader;
    }
    public Set<UsedAsAPIResponseReference> getUsedAsAPIResponseReferences() {
        return usedAsAPIResponse;
    }

    public void setUsedAsAPIResponseReferences(Set<UsedAsAPIResponseReference> usedAsAPIResponse) {
        this.usedAsAPIResponse =usedAsAPIResponse;
    }
    public Set<DescribesAssetsReference> getDescribesAssetsReferences() {
        return describesAssets;
    }

    public void setDescribesAssetsReferences(Set<DescribesAssetsReference> describesAssets) {
        this.describesAssets =describesAssets;
    }
    public Set<RelatedMediaReference> getRelatedMediaReferences() {
        return relatedMedia;
    }

    public void setRelatedMediaReferences(Set<RelatedMediaReference> relatedMedia) {
        this.relatedMedia =relatedMedia;
    }
    public Set<ActionsReference> getActionsReferences() {
        return actions;
    }

    public void setActionsReferences(Set<ActionsReference> actions) {
        this.actions =actions;
    }
    public Set<MeaningReference> getMeaningReferences() {
        return meaning;
    }

    public void setMeaningReferences(Set<MeaningReference> meaning) {
        this.meaning =meaning;
    }
    public Set<StarRatingsReference> getStarRatingsReferences() {
        return starRatings;
    }

    public void setStarRatingsReferences(Set<StarRatingsReference> starRatings) {
        this.starRatings =starRatings;
    }
    public Set<FacetsReference> getFacetsReferences() {
        return facets;
    }

    public void setFacetsReferences(Set<FacetsReference> facets) {
        this.facets =facets;
    }
    public Set<SupportingResourcesReference> getSupportingResourcesReferences() {
        return supportingResources;
    }

    public void setSupportingResourcesReferences(Set<SupportingResourcesReference> supportingResources) {
        this.supportingResources =supportingResources;
    }
    public Set<DataClassesAssignedToElementReference> getDataClassesAssignedToElementReferences() {
        return dataClassesAssignedToElement;
    }

    public void setDataClassesAssignedToElementReferences(Set<DataClassesAssignedToElementReference> dataClassesAssignedToElement) {
        this.dataClassesAssignedToElement =dataClassesAssignedToElement;
    }
    public Set<MeetingsReference> getMeetingsReferences() {
        return meetings;
    }

    public void setMeetingsReferences(Set<MeetingsReference> meetings) {
        this.meetings =meetings;
    }
    public Set<AlsoKnownAsReference> getAlsoKnownAsReferences() {
        return alsoKnownAs;
    }

    public void setAlsoKnownAsReferences(Set<AlsoKnownAsReference> alsoKnownAs) {
        this.alsoKnownAs =alsoKnownAs;
    }
    public Set<TagsReference> getTagsReferences() {
        return tags;
    }

    public void setTagsReferences(Set<TagsReference> tags) {
        this.tags =tags;
    }
    public Set<NoteLogsReference> getNoteLogsReferences() {
        return noteLogs;
    }

    public void setNoteLogsReferences(Set<NoteLogsReference> noteLogs) {
        this.noteLogs =noteLogs;
    }
    public Set<FoundInCollectionsReference> getFoundInCollectionsReferences() {
        return foundInCollections;
    }

    public void setFoundInCollectionsReferences(Set<FoundInCollectionsReference> foundInCollections) {
        this.foundInCollections =foundInCollections;
    }
    public Set<CertificationsReference> getCertificationsReferences() {
        return certifications;
    }

    public void setCertificationsReferences(Set<CertificationsReference> certifications) {
        this.certifications =certifications;
    }
    public Set<RelatedActionsReference> getRelatedActionsReferences() {
        return relatedActions;
    }

    public void setRelatedActionsReferences(Set<RelatedActionsReference> relatedActions) {
        this.relatedActions =relatedActions;
    }
    public Set<CommentsReference> getCommentsReferences() {
        return comments;
    }

    public void setCommentsReferences(Set<CommentsReference> comments) {
        this.comments =comments;
    }
    public Set<ManagedResourcesReference> getManagedResourcesReferences() {
        return managedResources;
    }

    public void setManagedResourcesReferences(Set<ManagedResourcesReference> managedResources) {
        this.managedResources =managedResources;
    }
    public Set<ExternalReferenceReference> getExternalReferenceReferences() {
        return externalReference;
    }

    public void setExternalReferenceReferences(Set<ExternalReferenceReference> externalReference) {
        this.externalReference =externalReference;
    }
    public Set<ContributorsReference> getContributorsReferences() {
        return contributors;
    }

    public void setContributorsReferences(Set<ContributorsReference> contributors) {
        this.contributors =contributors;
    }
    public Set<RelatedFromObjectAnnotationsReference> getRelatedFromObjectAnnotationsReferences() {
        return relatedFromObjectAnnotations;
    }

    public void setRelatedFromObjectAnnotationsReferences(Set<RelatedFromObjectAnnotationsReference> relatedFromObjectAnnotations) {
        this.relatedFromObjectAnnotations =relatedFromObjectAnnotations;
    }
    public Set<ImpactingProjectsReference> getImpactingProjectsReferences() {
        return impactingProjects;
    }

    public void setImpactingProjectsReferences(Set<ImpactingProjectsReference> impactingProjects) {
        this.impactingProjects =impactingProjects;
    }
    public Set<LicensesReference> getLicensesReferences() {
        return licenses;
    }

    public void setLicensesReferences(Set<LicensesReference> licenses) {
        this.licenses =licenses;
    }
    public Set<LikesReference> getLikesReferences() {
        return likes;
    }

    public void setLikesReferences(Set<LikesReference> likes) {
        this.likes =likes;
    }
    public Set<GovernedByRolesReference> getGovernedByRolesReferences() {
        return governedByRoles;
    }

    public void setGovernedByRolesReferences(Set<GovernedByRolesReference> governedByRoles) {
        this.governedByRoles =governedByRoles;
    }
    public Set<ResourceListAnchorsReference> getResourceListAnchorsReferences() {
        return resourceListAnchors;
    }

    public void setResourceListAnchorsReferences(Set<ResourceListAnchorsReference> resourceListAnchors) {
        this.resourceListAnchors =resourceListAnchors;
    }

// Lists

 public StringBuilder toString(StringBuilder sb) {
        if (sb == null) {
            sb = new StringBuilder();
        }

        sb.append("DocumentSchemaTypeReferences{");
        sb.append("attributesReference='").append(attributes.toString());
        sb.append("deployedSchemaTypesReference='").append(deployedSchemaTypes.toString());
        sb.append("implementationSnippetsReference='").append(implementationSnippets.toString());
        sb.append("parentMapToReference='").append(parentMapTo.toString());
        sb.append("usedAsAPIRequestReference='").append(usedAsAPIRequest.toString());
        sb.append("usedInSchemasReference='").append(usedInSchemas.toString());
        sb.append("parentMapFromReference='").append(parentMapFrom.toString());
        sb.append("linkedByReference='").append(linkedBy.toString());
        sb.append("usedAsAPIHeaderReference='").append(usedAsAPIHeader.toString());
        sb.append("usedAsAPIResponseReference='").append(usedAsAPIResponse.toString());
        sb.append("describesAssetsReference='").append(describesAssets.toString());
        sb.append("relatedMediaReference='").append(relatedMedia.toString());
        sb.append("actionsReference='").append(actions.toString());
        sb.append("meaningReference='").append(meaning.toString());
        sb.append("starRatingsReference='").append(starRatings.toString());
        sb.append("facetsReference='").append(facets.toString());
        sb.append("supportingResourcesReference='").append(supportingResources.toString());
        sb.append("dataClassesAssignedToElementReference='").append(dataClassesAssignedToElement.toString());
        sb.append("meetingsReference='").append(meetings.toString());
        sb.append("alsoKnownAsReference='").append(alsoKnownAs.toString());
        sb.append("tagsReference='").append(tags.toString());
        sb.append("noteLogsReference='").append(noteLogs.toString());
        sb.append("foundInCollectionsReference='").append(foundInCollections.toString());
        sb.append("certificationsReference='").append(certifications.toString());
        sb.append("relatedActionsReference='").append(relatedActions.toString());
        sb.append("commentsReference='").append(comments.toString());
        sb.append("managedResourcesReference='").append(managedResources.toString());
        sb.append("externalReferenceReference='").append(externalReference.toString());
        sb.append("contributorsReference='").append(contributors.toString());
        sb.append("relatedFromObjectAnnotationsReference='").append(relatedFromObjectAnnotations.toString());
        sb.append("impactingProjectsReference='").append(impactingProjects.toString());
        sb.append("licensesReference='").append(licenses.toString());
        sb.append("likesReference='").append(likes.toString());
        sb.append("governedByRolesReference='").append(governedByRoles.toString());
        sb.append("resourceListAnchorsReference='").append(resourceListAnchors.toString());
        sb.append("relatedToObjectAnnotationsReference='").append(relatedToObjectAnnotations.toString());

        sb.append('}');

        return sb;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) { return false; }
        if (!super.equals(o)) { return false; }
         DocumentSchemaTypeReferences typedThat = (DocumentSchemaTypeReferences) o;
      // compare single cardinality attributes
         if (this.attributes != null && !Objects.equals(this.attributes,typedThat.attributes)) {
                            return false;
                 }
         if (this.deployedSchemaTypes != null && !Objects.equals(this.deployedSchemaTypes,typedThat.deployedSchemaTypes)) {
                            return false;
                 }
         if (this.implementationSnippets != null && !Objects.equals(this.implementationSnippets,typedThat.implementationSnippets)) {
                            return false;
                 }
         if (this.parentMapTo != null && !Objects.equals(this.parentMapTo,typedThat.parentMapTo)) {
                            return false;
                 }
         if (this.usedAsAPIRequest != null && !Objects.equals(this.usedAsAPIRequest,typedThat.usedAsAPIRequest)) {
                            return false;
                 }
         if (this.usedInSchemas != null && !Objects.equals(this.usedInSchemas,typedThat.usedInSchemas)) {
                            return false;
                 }
         if (this.parentMapFrom != null && !Objects.equals(this.parentMapFrom,typedThat.parentMapFrom)) {
                            return false;
                 }
         if (this.linkedBy != null && !Objects.equals(this.linkedBy,typedThat.linkedBy)) {
                            return false;
                 }
         if (this.usedAsAPIHeader != null && !Objects.equals(this.usedAsAPIHeader,typedThat.usedAsAPIHeader)) {
                            return false;
                 }
         if (this.usedAsAPIResponse != null && !Objects.equals(this.usedAsAPIResponse,typedThat.usedAsAPIResponse)) {
                            return false;
                 }
         if (this.describesAssets != null && !Objects.equals(this.describesAssets,typedThat.describesAssets)) {
                            return false;
                 }
         if (this.relatedMedia != null && !Objects.equals(this.relatedMedia,typedThat.relatedMedia)) {
                            return false;
                 }
         if (this.actions != null && !Objects.equals(this.actions,typedThat.actions)) {
                            return false;
                 }
         if (this.meaning != null && !Objects.equals(this.meaning,typedThat.meaning)) {
                            return false;
                 }
         if (this.starRatings != null && !Objects.equals(this.starRatings,typedThat.starRatings)) {
                            return false;
                 }
         if (this.facets != null && !Objects.equals(this.facets,typedThat.facets)) {
                            return false;
                 }
         if (this.supportingResources != null && !Objects.equals(this.supportingResources,typedThat.supportingResources)) {
                            return false;
                 }
         if (this.dataClassesAssignedToElement != null && !Objects.equals(this.dataClassesAssignedToElement,typedThat.dataClassesAssignedToElement)) {
                            return false;
                 }
         if (this.meetings != null && !Objects.equals(this.meetings,typedThat.meetings)) {
                            return false;
                 }
         if (this.alsoKnownAs != null && !Objects.equals(this.alsoKnownAs,typedThat.alsoKnownAs)) {
                            return false;
                 }
         if (this.tags != null && !Objects.equals(this.tags,typedThat.tags)) {
                            return false;
                 }
         if (this.noteLogs != null && !Objects.equals(this.noteLogs,typedThat.noteLogs)) {
                            return false;
                 }
         if (this.foundInCollections != null && !Objects.equals(this.foundInCollections,typedThat.foundInCollections)) {
                            return false;
                 }
         if (this.certifications != null && !Objects.equals(this.certifications,typedThat.certifications)) {
                            return false;
                 }
         if (this.relatedActions != null && !Objects.equals(this.relatedActions,typedThat.relatedActions)) {
                            return false;
                 }
         if (this.comments != null && !Objects.equals(this.comments,typedThat.comments)) {
                            return false;
                 }
         if (this.managedResources != null && !Objects.equals(this.managedResources,typedThat.managedResources)) {
                            return false;
                 }
         if (this.externalReference != null && !Objects.equals(this.externalReference,typedThat.externalReference)) {
                            return false;
                 }
         if (this.contributors != null && !Objects.equals(this.contributors,typedThat.contributors)) {
                            return false;
                 }
         if (this.relatedFromObjectAnnotations != null && !Objects.equals(this.relatedFromObjectAnnotations,typedThat.relatedFromObjectAnnotations)) {
                            return false;
                 }
         if (this.impactingProjects != null && !Objects.equals(this.impactingProjects,typedThat.impactingProjects)) {
                            return false;
                 }
         if (this.licenses != null && !Objects.equals(this.licenses,typedThat.licenses)) {
                            return false;
                 }
         if (this.likes != null && !Objects.equals(this.likes,typedThat.likes)) {
                            return false;
                 }
         if (this.relatedToObjectAnnotations != null && !Objects.equals(this.relatedToObjectAnnotations,typedThat.relatedToObjectAnnotations)) {
                            return false;
                 }
         if (this.governedByRoles != null && !Objects.equals(this.governedByRoles,typedThat.governedByRoles)) {
                            return false;
                 }
         if (this.resourceListAnchors != null && !Objects.equals(this.resourceListAnchors,typedThat.resourceListAnchors)) {
                            return false;
                 }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode()
    ,this.attributes
    ,this.deployedSchemaTypes
    ,this.implementationSnippets
    ,this.parentMapTo
    ,this.usedAsAPIRequest
    ,this.usedInSchemas
    ,this.parentMapFrom
    ,this.linkedBy
    ,this.usedAsAPIHeader
    ,this.usedAsAPIResponse
    ,this.describesAssets
    ,this.relatedMedia
    ,this.actions
    ,this.meaning
    ,this.starRatings
    ,this.facets
    ,this.supportingResources
    ,this.dataClassesAssignedToElement
    ,this.meetings
    ,this.alsoKnownAs
    ,this.tags
    ,this.noteLogs
    ,this.foundInCollections
    ,this.certifications
    ,this.relatedActions
    ,this.comments
    ,this.managedResources
    ,this.externalReference
    ,this.contributors
    ,this.relatedFromObjectAnnotations
    ,this.impactingProjects
    ,this.licenses
    ,this.likes
    ,this.relatedToObjectAnnotations
    ,this.governedByRoles
    ,this.resourceListAnchors
       );
    }

    @Override
    public String toString() {
        return toString(new StringBuilder()).toString();
    }
}